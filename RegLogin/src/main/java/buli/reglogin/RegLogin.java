
package buli.reglogin;

/**
 *
 * @author bulel
 */
import java.util.Scanner;
public class RegLogin {
 
    private static String name;
    private static String surName;
    private static String userName;
    private static String passWord;
    
     
 //set and get the user's name
    public static void setName(String Name)
    {
        name = Name;
    }
    public static String getName()
    {
        return name;
    }
    
    //set and get the user's surname
    public static void setSurname(String surname)
    {
        surName = surname;
    }
    public static String getSurname()
    {
        return surName;
    }
//set to find the username
    public static void setUserName(String name)
    {               
        userName = name;
    }
    public static String getUserName()
    {
        return userName;
    }
    //set to find the password
    public static void setPassword(String password)
    {
        passWord = password;
    }
    public static String getPassword()
    {
        return passWord;
    }
   

    
    public static void main(String[] args)
    {
        
        login loginObj = new login();
        
         /*Prompt the user for the required input and then pass the input directly to the methods that use it*/   
        Scanner data = new Scanner(System.in);
        System.out.println(" *** WELCOME TO REGISTRATION *** ");
        
        System.out.print("Enter your First Name:  ");
        setName(data.nextLine());
        
        System.out.print("Enter your Surname:  ");
        setSurname(data.nextLine());
        
        
        System.out.print("Enter your USERNAME it should contain 5 characters and an underscore. ");
        setUserName(data.nextLine());
        
        loginObj.checkUserName(getUserName()); // ensure the username meets the requirements
        
        System.out.print("Enter your PASSWORD it should contain aleast one special"
                + " character, UPPERCASE & lowercase and 8 characters and number ");
               
        setPassword(data.nextLine());                

        loginObj.checkPasswordComplexity(passWord); // ensure the password meets the requirements
        
        /*Progress the username and password to the method and then print out the messages returned by the method*/
        System.out.println( loginObj.registerUser( getPassword(), getUserName() ));
        
        //Save the boolean value returned by loginUser() in the regStatus varible. The boolean value will used in the returnLoginStatus method
        boolean regStatus;
        regStatus = loginObj.loginUser(loginObj.checkUserName(getUserName()),
                loginObj.checkPasswordComplexity(getPassword()), getPassword(), getUserName());
        
        System.out.println(loginObj.returnLoginStatus(regStatus, getName(), getSurname()));
    }
}
