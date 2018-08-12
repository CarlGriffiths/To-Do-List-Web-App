package models;



public class Login  {
    
   
    public String email;
    public String pass;
    
   
    //@ManyToOne
    //public Category category;

    public String validate(){
        if(User.auth(email, pass) == null){
            return "invalid email or password";
        }
        return null;
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
