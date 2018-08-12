package models;



public class Login  {
    
   
    public String email;
    public String pass;
    
   
    //@ManyToOne
    //public Category category;

    public Login(){

    }

    public Login(String email, String pass){
        
        this.email = email;
        this.pass = pass;  

    }


    public String getEmail(){
        return email;
    }
    public String getPass(){
        return pass;
    }

    public void setEmail(String e){
        this.email = e;
    }
    public void setPass(String p){
        this.pass = p;
    }

 
    


    
}
