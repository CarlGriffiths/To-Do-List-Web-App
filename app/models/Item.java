package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Item extends Model {
    
    @Id
    public int Id;
    public String message;
    public Boolean completed;

    public Item(){

    }

    public Item(int id, String message){
        this.Id = id;
        this.message = message;
        

    }

    public static final Finder<Integer, Item> find = new Finder<>(Item.class);

    public static final List<Item> findAll() {
        return Item.find.all();
      }


    public int getId(){
        return Id;
    }

    public String getMessage(){
        return message;
    }

    public Boolean getCompleted(){
        return completed;
    }

    public void setId(int id){
        this.Id = id;
    }

    public void setMessage(String message){
        setCompletedFalse();
        this.message = message;
    }

    public void setCompletedTrue(){
        this.completed = true;
    }

    public void setCompletedFalse(){
        this.completed = false;
    }
}
