
package th_lab3;

public class Author {
    private String name, email;
    private char gender;
    
    public Author(String name, String email, char gender){
        this.email = email;
        this.gender = gender;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String newemail){
        this.email = newemail;
    }
    
    public char getGender(){
        return gender;
    }
    
    public String toString(){
        return name +"("+gender+") tai "+email;
    }
}
