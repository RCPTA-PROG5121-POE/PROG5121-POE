/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buli.reglogin;

/**
 *
 * @author bulel
 */
import java.util.Scanner;
public class login 
{
     String passWordMessage;
    
    String userNameMessage;
   
    /*Check to see if the username contains an underscore and is not longer than 5 letters*/
    public boolean checkUserName(String userName){
        return userName.contains("_") && userName.length() <= 5;
        
}
    public boolean checkPasswordComplexity(String password){
        
      boolean passwordOkay = false; boolean hasNumber = false;boolean hasCap = false;boolean hasChar = false;char current;
      
     /*password should have atleast 8 characters
      1 capital letter
      1 lower case and 1 number
      */
      
      if (password.length() >= 8){ 
            for (int i =0; i < password.length(); i++){
                current = password.charAt(i);

                if(Character.isDigit(current)){
                    hasNumber = true;
                }
                else if(Character.isUpperCase(current)){
                    hasCap = true;
                }
                else if (!(Character.isLetterOrDigit(current))){
                    hasChar = true;
                }
            }
        }  
        if(hasNumber && hasCap && hasChar){
            passwordOkay = true;
        }
        return passwordOkay;
        
    }  
 public String registerUser(String pass, String name){
        if (checkPasswordComplexity(pass)){
            passWordMessage = "Password successfully captured.";
        }
        else{
            passWordMessage = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, "
            + "a capital letter, a number and a special character. ";
        }
        
        if (checkUserName(name)){
            userNameMessage = "User name successfully captured. ";
        }
        else{
            userNameMessage = "Username is not correctly formatted, please ensure that your "
                    + "username contains an underscore and is no more than 5 characters in length. ";
        }
        
        return (userNameMessage+ "\n" + passWordMessage);
    }
  public boolean loginUser(boolean checkName, boolean checkPassword, String passwrd, String userName){
        
        boolean logged = false;
        if(checkName && checkPassword) { //only run if the user successfully registered

            Scanner in = new Scanner(System.in);
            System.out.println("");
            System.out.println(" ***NOW YOU CAN SUCCESSFULLY  LOGIN *** ");            
            System.out.print("Enter the username you used to register: ");
            String username = in.nextLine();
            System.out.print("Enter the password you used to register: ");
            String password = in.nextLine();
            
            if (password.equals(password) && username.equals(userName)  ){
                logged = true;
            }
        }
        return logged;
    }
   public String returnLoginStatus(boolean regStatus, String name, String surname){
        String message;
        
        /*
        To avoid unnecessary messages, the login status will only be returned if the user managed to register an account.
        Meaning that an appropriate message will only be displayed depending on wether the login details meet the details
        used to create an account*/
        
        message = "Username and/or password incorrect, please try again. ";
        
        if (regStatus){
            message = "Welcome  " + name + " " + surname + ", it is great to see you again.";
        }
        return message;
    }
        
}