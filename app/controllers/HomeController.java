package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.*;
import javax.inject.Inject;

import models.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;


import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    
    private FormFactory formFactory;
    private Date date = new Date();
        

    @Inject
    public HomeController(FormFactory f){
        formFactory = f;

    }
    

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

     @Security.Authenticated(Secured.class)
    @Transactional
    public Result index(Integer cat) {
        
        List<Item> itemList = new ArrayList<Item>();
        List<Category> categoryList = Category.findAll();
        //gets logged in users
        User u = User.getUserById(session().get("email"));
        //0 will return all items
        if(cat == 0){
            //returns list of items for the logged in user
            itemList = u.getItems();
            

        }
        else {
            List<Item> temp = Category.find.ref(cat).getCatItems();
            for(int i = 0; i < temp.size(); i++){
                if(temp.get(i).getUser().equals(u)){
                   itemList.add(temp.get(i));
                }
            }
            

        }
        Form<Item> itemForm = formFactory.form(Item.class);

        return ok(index.render(itemList, itemForm, categoryList));
    }

    public Result submit() {
        
        Form<Item> itemForm = formFactory.form(Item.class).bindFromRequest();
        Item newItem = itemForm.get();

        //gets the total num of items and add 1 for new id
        int createNewId = getNum() + 1;

        //if task message is empty then do not submit
        if(newItem.getMessage().isEmpty()){
            flash("emptyMessage", "Error please enter a task");
            //the value 0 is passed into parm becasue it requires a arg, and 0 will return all items
            return redirect(routes.HomeController.index(0)); 
        }
        else {

        newItem.setId(createNewId);
        //the date is set on the adddate page, so instead of gettting a null value I initially set it to todays date
        newItem.setDate(date);
        User p = User.getUserById(session().get("email"));
        Item itemFind = Item.find.byId(createNewId);
        p.addItem(itemFind);
        newItem.setUser(p);        
        newItem.save();
        return redirect(routes.HomeController.addDate(createNewId));
        }
    }

    public Result test(){
        return ok(test.render());
    }

    public Result overdue(){
        List<Item> items = Item.findAll();

        return ok(overdue.render(items));
    }

    public Result edit(int id) {

        Form<Item> itemForm = formFactory.form(Item.class);
        Item itemFind = Item.find.byId(id);
        User u = User.getUserById(session().get("email"));
        
        if(itemFind.getUser().equals(u)){
        itemForm = formFactory.form(Item.class).fill(itemFind);
        return ok(edit.render(itemForm, id));
        }
        else{
            System.out.println("error! you can only edit your own posts");
            return redirect(routes.HomeController.index(0));
        }
        
    }


    public Result addDate(int id) {

        Form<Item> itemForm = formFactory.form(Item.class);
        Item itemFind = Item.find.byId(id);
        itemForm = formFactory.form(Item.class).fill(itemFind);
    
        return ok(adddate.render(itemForm, id));
    }


    public Result submitDate(int id) {
        
        Form<Item> itemForm = formFactory.form(Item.class).bindFromRequest();
        Item itemDate = itemForm.get();

        Item item = Item.find.byId(id);

        //testing
        System.out.println("test====" + itemDate.getCat());


       //item.setMessage(itemDate.getDate());

        //setting date to what was passed into form
        item.setDate(itemDate.getDate());
        item.setCat(itemDate.getCat());
        item.update();
        //the value 0 is passed into parm becasue it requires a arg, and 0 will return all items
        return redirect(routes.HomeController.index(0));
    }

    public Result delete(int id) {
        
        Item itemToChange = Item.find.byId(id);
        
        User u = User.getUserById(session().get("email"));
        
       
        if (itemToChange.getCompleted() == true && itemToChange.getUser().equals(u)){


            itemToChange.delete();
            return redirect(routes.HomeController.completed());
        }
        else if (itemToChange.getCompleted() == false && itemToChange.getUser().equals(u)) {
            itemToChange.delete();
            //the value 0 is passed into parm becasue it requires a arg, and 0 will return all items
            return redirect(routes.HomeController.index(0));

        }

        else{
            System.out.println("Error!!! you cannto delete other users posts");
            return redirect(routes.HomeController.index(0));

        }
       
        
    }

    public Result changeStatus(int id){
        Item itemToChange = Item.find.byId(id);
        User u = User.getUserById(session().get("email"));
        

        if(itemToChange.getCompleted() == false && itemToChange.getUser().equals(u)){
            itemToChange.setCompletedTrue();
            //sets the date complated to todays date
            itemToChange.setDateCompleted(date);
          
            itemToChange.update();
            return redirect(routes.HomeController.index(0));

        }

        else if (itemToChange.getCompleted() == true && itemToChange.getUser().equals(u)){

            itemToChange.setCompletedFalse();
            //sets the date complated to todays date
           
             itemToChange.update();
            return redirect(routes.HomeController.completed());
        }

        else{
            System.out.println("you can only edit your items");
            return redirect(routes.HomeController.index(0));
        }

        
        
    }

    public Result today(){
        
        return TODO;
            
    }
    
    public int getNum(){
        List <Item> itemList = Item.findAll();
        int highest = 0;

            for (int i = 0; i < itemList.size(); i++) {

            int num = itemList.get(i).getId();

                 if(num > highest){
                    highest = num;
                
                }
            }   

                return highest; 
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result completed(){
        List <Item> itemList = Item.find.query().where().orderBy("Id desc").findList();
        List<Item> uItem = new ArrayList<>();
        User u = User.getUserById(session().get("email"));

        uItem = u.getItems();


        return ok(completed.render(uItem));

    }

    public Result register() {

        Form<User> userForm = formFactory.form(User.class);
        return ok(register.render(userForm));
    }

     public Result login() {

        Form<Login> loginForm = formFactory.form(Login.class);
        return ok(login.render(loginForm));
    }

    public Result submitLogin() {

        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if(loginForm.hasErrors()){
            return badRequest(login.render(loginForm));

        }

        else{
            session().clear();
            session("email", loginForm.get().getEmail());
        }
        return redirect(routes.HomeController.index(0));
    }

    public Result submitRegister() {

        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        User newUser = userForm.get();
        

        if(checkEmail(newUser.getEmail()) == false){
            
            System.out.println("email not unique");
            flash("emailError", "Error please use a different email");
            return redirect(routes.HomeController.register());
        }
        
        newUser.save();
        return redirect(routes.HomeController.index(0));
       
        
    }

    public boolean checkEmail(String e) {

        List<User> allUsers = User.findAll();
        Set<String> hSet = new HashSet<>();

        for(int i = 0; i < allUsers.size(); i++){
            if(allUsers.get(i).getEmail().equals(e)){
                return false;

            }
        }
        
        
       return true;
        
    }


}
