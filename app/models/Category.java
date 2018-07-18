package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Category extends Model {
    
    @Id
    public int Id;
    public String name;
    
    @OneToMany
    List<Item> items;

    public Category(){

    }

    public Category(int id, String name){
        this.Id = id;
        this.name = name;

    }

    public static final Finder<Integer, Item> find = new Finder<>(Item.class);

    public static final List<Item> findAll() {
        return Item.find.all();
      }


    public int getId(){
        return Id;
    }

  

    public void setId(int id){
        this.Id = id;
    }



    
}
