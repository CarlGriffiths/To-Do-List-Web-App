package controllers;

import java.util.*;

import play.data.*;

import play.mvc.*;

import views.html.*;

import javax.inject.Inject;

import models.*;


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
    public Result index() {
        List <Item> itemList = Item.find.query().where().orderBy("Id desc").findList();
        Form<Item> itemForm = formFactory.form(Item.class);

        return ok(index.render(itemList, itemForm));
    }

    public Result submit() {
        
        Form<Item> itemForm = formFactory.form(Item.class).bindFromRequest();
        Item newItem = itemForm.get();

        //gets the total num of items and add 1 for new id
        int createNewId = getNum() + 1;

        newItem.setId(createNewId);

        //the date is set on the adddate page, so instead of gettting a null value I initially set it to todays date
        newItem.setDate(date);
        newItem.save();
        return redirect(routes.HomeController.addDate(createNewId));
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
        System.out.println("test====" + itemDate.getMessage());


        item.setMessage(itemDate.getMessage());

        //setting date to what was passed into form
        item.setDate(itemDate.getDate());
        item.update();
        return redirect(routes.HomeController.index());
    }

    public Result delete(int id) {
        
        Item itemToChange = Item.find.byId(id);
        itemToChange.delete();
       
        return redirect(routes.HomeController.index());
    }

    public Result changeStatus(int id){
        Item itemToChange = Item.find.byId(id);

        if(itemToChange.getCompleted() == false){
            itemToChange.setCompletedTrue();

        }

        else if (itemToChange.getCompleted() == true){
            itemToChange.setCompletedFalse();
        }

        
        itemToChange.update();
        return redirect(routes.HomeController.index());
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

}
