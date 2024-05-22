/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10129570.easykanban;

/**
 *
 * @author bulel
 */

//import static.st10129570.easykanban.UserDetails.setTaskNumber;
import javax.swing.JOptionPane;

public class Task 
{
    UserDetails taskinput = new UserDetails();
    
    public boolean checkTaskDescription(){
        if(taskinput.getDescription().length() <=50){
            return true;
        }
        else{
            return false;
        }
    }
    
    //task ID IS CREATED
    public static String createTaskID(){
        String count = " ";
        char character;
        for(int x = 0; x < UserDetails.getDeveloperNames().length(); x++){
            character = UserDetails.getDeveloperNames().charAt(x);
            if(character == ' '){
                count = UserDetails.getDeveloperNames().substring(x-3, x);
            }
        }
        String ID = UserDetails.getTaskName().substring(0,2)+":"+ UserDetails.getTaskNumber()+":"+count;
        
        return ID.toUpperCase();
    }
    //Method print taskDetails
    public static String printTaskDetails(){
        return UserDetails.getStatus()+"\n1. "+UserDetails.getDeveloperNames()+"\n2. "+UserDetails.getTaskNumber()+"\n3. "+
                UserDetails.getTaskName()+"\n4. " +UserDetails.getDescription()+"\n5. "+createTaskID()+"\n6. "+UserDetails.getDuration();
    }
       public int returnTotalHours(){
           return UserDetails.duration;
       }
       
}
