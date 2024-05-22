/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10129570.easykanban;

/**
 *
 * @author bulel
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Login 
{
     //makes sure the username includes an underscre
    public boolean checkUserName()
    {
        if(RegisterPage.userName.contains("_") && RegisterPage.userName.length()<=5)
        {
            return true;
        }
        else{
            return false;
        }
    }
         //Ensures that the password meets the conditions and includes special characters
    public boolean checkPasswordComplexity(){
        
        boolean passwordStatus = false;
        boolean length = false;
        boolean number = false;
        boolean specialCharacter = false;
        boolean upperCase = false;
        char ch;
        
        if(RegisterPage.password.length() >= 8){
            length = true;
        }
        for(int i = 0; i < RegisterPage.password.length(); i = i+1 ){
            ch = RegisterPage.password.charAt(i);
            
            if(Character.isDigit(ch)){
                number = true;
            }
            if(Character.isUpperCase(ch)){
                upperCase = true;
            }
            if(!Character.isLetterOrDigit(ch)){
                specialCharacter = true;
            }
            
            passwordStatus = specialCharacter && number && length && upperCase;
        }
        return passwordStatus;
    }
    //Register method
    public void registerUser()
    {
        if(checkUserName())
        {
            JOptionPane.showMessageDialog(null, "USER REGISTRATION \n"
                    + "Username successfully captured");
        }
        else{
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username"
                    + "contains an underscore (_) is no more than 5 character in length");
        }
        if(checkPasswordComplexity()){
            JOptionPane.showMessageDialog(null, "USER REGISTRATION \n"
                    + "Password successfully captured");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted \n"
                    + "Please ensure the password contains at least 8 characters \n"
                    + "A capital Letter A number and special character");
        }
    }
    //Login Method
    boolean loginUser(){
        String username2;
        String password2;
        
        username2 = JOptionPane.showInputDialog("USER LOGIN \n"
                + "Enter Username: ");
        
         password2 = JOptionPane.showInputDialog("USER LOGIN \n"
                + "Enter Password: ");
         
         if(RegisterPage.userName.equals(username2) && RegisterPage.password.equals(password2)){
             return true;
         }
         else{
             return false;
         }
    }
    public String returnLoginStatus(){
        if(loginUser()){
            return "Thank You \n"
                    + "" + RegisterPage.firstName + " " + RegisterPage.surname + "\n"
                    +"YOU HAVE SUCCESSFULLY LOGIN ";
        }
        else{
            return "Username or password incorrect please try again";
        }
    }
}
