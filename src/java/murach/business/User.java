/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

package murach.business;
import java.io.Serializable;
public class User implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String birthDay;
    
    public User(){
        firstName ="";
        lastName = "";
        email = "";
        birthDay="";
    }
    
    public User(String firstName, String lastName, String email, String birthDay){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDay = birthDay;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
     public String getBirthDay(){
        return birthDay;
    }
    
    public void setBirthDay(String birthDay){
        this.birthDay = birthDay;
    }
    
    
}
