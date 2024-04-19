/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */


public class Registration {
    
    //Creation of attributes to store user details
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    public int strLength;
    public int passLength;
   
    
    //Creation of default constructors to set the default values for all attributes 

    public Registration() {
        this.firstName = "";
        this.lastName = "";
        this.userName = "";
        this.password = "";
        this.strLength = 0;
        this.passLength = 0;
        
    }
    
    //Creation for getters that return the values of each attribute

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    public int getStrLength() {
        return strLength;
    }
    
     public int getPassLength() {
        return passLength;
    }


   
    
    //Creation of setters that assign values for each attribute

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setStrLength(int strLength) {
        this.strLength = strLength;
    }
    
    public void setpassLength(int passLength) {
        this.passLength = passLength;
    }


   
    
    //Method for determining the charecter length for username  password
    public int CalcCharLength(){
    return  strLength = userName.length();
    }
    
    public int CalcPassLength(){
    return passLength = password.length();
    
  
    }
    
    
    public boolean IsValid (){
    
    Pattern p = Pattern.compile("([_])");//Password pattern for underscore
    Matcher m = p.matcher(userName);
    
    Pattern o = Pattern.compile("([A-Z])([1-9])");
    Matcher n = o.matcher(password);
    
    return m.find()&& n.find();
     
    
     }
    
    
    
    
}

