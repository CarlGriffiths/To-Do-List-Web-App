package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Category extends Model {
    
    @Id
    public Long Id;
    public String name;
    
    @OneToMany
    List<Item> items;

    public Category(){

    }

    public Category(Long id, String name){
        this.Id = id;
        this.name = name;

    }

    public static final Finder<Integer, Category> find = new Finder<>(Category.class);

    public static final List<Category> findAll() {
        return Category.find.all();
      }


    public Long getId(){
        return Id;
    }

    public String getName(){
        return name;
    }

  

    public void setId(Long id){
        this.Id = id;
    }

    public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<>();

    // Get all categories from the DB and add to the options hash map
    for (Category c: Category.find.all()) {
      options.put(c.getId().toString(), c.getName());
    }
    return options;
  }



    
}
