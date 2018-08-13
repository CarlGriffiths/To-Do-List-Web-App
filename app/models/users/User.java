package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class User extends Model {
    
    @Id
    public String email;
    public String pass;
    public int compcount = 0;
    
   
    @OneToMany
    public List<Item> items;

    public User(){

    }

    public User(String email, String pass){
        
        this.email = email;
        this.pass = pass;  

    }

    public static final Finder<String, User> find = new Finder<String, User>(User.class);

    public static final List<User> findAll() {
        return User.find.all();
    }

    public static User auth(String email, String pass){
        return find.query().where().eq("email", email).eq("pass", pass).findUnique();

    }


    public String getEmail(){
        return email;
    }
    public String getPass(){
        return pass;
    }
    public int getcompcount(){
        return compcount;
    }

    public void setEmail(String e){
        this.email = e;
    }
    public void setPass(String p){
        this.pass = p;
    }
    public void addToCompleted(){
        compcount = compcount + 1;
    }
     public void subtractFromCompleted(){
        compcount = compcount - 1;
    }

     public static User getUserById(String id){
        if (id == null){
            return null;
        }
        else {
            return find.byId(id);
        }

    }

    public void addItem(Item i) {
        items.add(i);
        
    }

     public List<Item> getItems() {
        return items;
        
    }

    public int getNumUncompleted(){
       
        return getItems().size() - getcompcount();
    }

    
}
