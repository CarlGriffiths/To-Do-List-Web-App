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
    public Date date;
    public Boolean completed;
    //public static int dueToday;
   
    @ManyToOne
    public Category category;

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
        return message.toUpperCase();
    }

    public Boolean getCompleted(){
        return completed;
    }

    public Date getDate(){
        return date;
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
    public void setDate(Date d){
        this.date = d;
    }
    public void setCat(Category c){
        this.category = c;
    }

    public Category getCat(){
        return category;
    }

    public String dateToString(){

        return String.format("%1$td%1$tB%1$tY", date);

    }

    public String todaysDateToString(){

        return String.format("%1$td%1$tB%1$tY", new Date());

    }

    public Boolean isToday(){
        Boolean returnValue = false;

    
        if(dateToString().equals(todaysDateToString())){
            returnValue = true;
        }
        return returnValue;
    }


    
}
