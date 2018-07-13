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
        List <Item> itemList = Item.findAll();
        Form<Item> itemForm = formFactory.form(Item.class);

        return ok(index.render(itemList, itemForm));
    }

    public Result submit() {
        
        Form<Item> itemForm = formFactory.form(Item.class).bindFromRequest();
        Item newItem = itemForm.get();
        newItem.setId(getNum() + 1);
        newItem.save();
        return redirect(routes.HomeController.index());
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
