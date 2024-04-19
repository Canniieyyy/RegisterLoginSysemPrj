/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;


import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class UserLoginRegistrationPrj {

    static Registration objRegistration = new Registration();
    
    public static void main(String[] args) {
        GetUserInput();
        CheckUserNameComplexity();
        UpperCaseChecker ();
    }
    
    //Method for accepting user input
    
  public static void GetUserInput(){
      objRegistration.setFirstName(JOptionPane.showInputDialog("Please enter your first name"));
      objRegistration.setLastName(JOptionPane.showInputDialog("Please enter your last name"));     
    
      
    }
  
  //Method for determaining if the username charecter length and underscore is within parameter
  
  public static void CheckUserNameComplexity(){
      int charecters = objRegistration.CalcCharLength();
      boolean underScore = objRegistration.IsValid( );
      
      objRegistration.setUserName(JOptionPane.showInputDialog("Please create a username"));
       
      while(charecters > 5 && (underScore)){
      
      
      if (charecters > 5 ){ JOptionPane.showMessageDialog(null, "Sorry username needs to be 5 charecters long or less");
      
      }
      
      else{JOptionPane.showMessageDialog(null, "Username correctly formatted");
      
      }
      
   }
  }
 //Method for determining if username has atleast one uppercase
  
  public static void UpperCaseChecker (){
      int charecter = objRegistration.CalcPassLength();
      boolean upperCase = objRegistration.IsValid();
      
      while (upperCase) {
         JOptionPane.showMessageDialog(null,"Sorry Password not valid please try again");
         upperCase = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Please create a Password"));
         
     }
      
      
      
  }
 
  
  
  
  
  
  
}





//JOptionPane.showMessageDialog(null, "Sorry username needs to be 5 charecters or less");
// else {JOptionPane.showMessageDialog(null, "Welcome");}
              
             