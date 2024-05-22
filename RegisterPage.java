/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package st10129570.easykanban;

/**
 *
 * @author bulel
 */
import javax.swing.JOptionPane;
public class RegisterPage 
{
    //Declaring our string data types.
    static String firstName;
    static String userName;
    static String surname;
    static String password;
    
    public static void userDetails()
    {
        //JoptionPane window for registrations
        firstName = JOptionPane.showInputDialog("Please enter your first name");
        surname = JOptionPane.showInputDialog("Please enter your surname");
        userName = JOptionPane.showInputDialog("Please enter your username");
        password = JOptionPane.showInputDialog("Please enter your password");
        
    }
    
    
    public static void main(String[] args) 
    {
      userDetails();
      Login logObject = new Login();
      
      logObject.checkUserName();
      logObject.registerUser();
      UserDetails info = new UserDetails();
      info.WelcomeNote();
      
      // combining our class login with userDetails and bring all our method to communicate with one another to get the result we were asked to prepare.
   

    }
}
