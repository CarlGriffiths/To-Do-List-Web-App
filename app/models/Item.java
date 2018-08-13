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
    public Boolean completed = false;
    public Date dateCompleted;
    
    //public static int dueToday;
   
    @ManyToOne
    public Category category;

    @ManyToOne
    public User user;

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
    public Category getCat(){
        return category;
    }

    public User getUser(){
        return user;
    }

    public String getDateCompleted(){
        //add one becasue jan starts at 0
        int month = dateCompleted.getMonth() + 1;
        String stringreturned = "Completed on: " + dateCompleted.getDate() + "/" + month  + "/" + dateCompleted.getMonth();
        return stringreturned;
    }
    
    public void setId(int id){
        this.Id = id;
    }

    public void setMessage(String message){
        //setCompletedFalse();
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
    public void setUser(User u){
        this.user = u;
    }
    
    public void setDateCompleted(Date d){
        this.dateCompleted = d;
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

    public Boolean hasDatePassed(){
        Boolean returnValue = false;

    
        if(getDate().before(new Date())){
            returnValue = true;
        }
        return returnValue;
    }

    

    


    
}
