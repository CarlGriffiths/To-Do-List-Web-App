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

    public static final Finder<Integer, Category> find = new Finder<>(Category.class);

    public static final List<Category> findAll() {
        return Category.find.all();
      }


    public int getId(){
        return Id;
    }

    public String getName(){
        return name;
    }

  

    public void setId(int id){
        this.Id = id;
    }

    public List<Item> getCatItems(){
        return this.items;
    }

    public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<>();

    // Get all categories from the DB and add to the options hash map
    for (Category c: Category.find.all()) {
        String id = Integer.toString(c.getId());
        options.put(id, c.getName());
    }
    return options;
  }



    
}
