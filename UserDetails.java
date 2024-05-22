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

public class UserDetails 
{
    //Declaring variables
    private static int NumberOfTask;
    private static String TaskName;
    public static int TaskNumber;
    private static String Description;
    private static String DeveloperNames;
    private static int Duration;
    private static int ID;
    private static String Status;
    static int duration = 0;
    
    //getting input from user
    Scanner input = new Scanner(System.in);
    public static void setNumberOfTask(){
        NumberOfTask = Integer.parseInt(JOptionPane.showInputDialog("Enter number of task you wish to perform"));
    }
    //Getters and setters
    public static int getNumberOfTask(){
        return NumberOfTask;
    }
    public static void setTaskName(){
        TaskName = JOptionPane.showInputDialog("Enter Task Name");
    }
    public static String getTaskName(){
        return TaskName;
    }
    public static void setTaskNumber(int x){
        TaskNumber = x;
    }
    
    public static int getTaskNumber(){
        return TaskNumber;
    }
    
    public static void setDescription(){
        Description = JOptionPane.showInputDialog("Enter task Description");
    }
    
    public static String getDescription(){
        return Description;
    }
    
    public static void setDeveloperNames(){
        
        DeveloperNames = JOptionPane.showInputDialog("Enter Developer Names");
    }
    public static String getDeveloperNames(){
        return DeveloperNames;
    }
    
    public static void setDuration(){
        
        Duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration"));
    }
    public static int getDuration(){
        return Duration;
    }
    
    public static void setStatus(){
        //creating options and organising the tasks from [To Do] [DOING] [DONE]
        
        Status = JOptionPane.showInputDialog("Choose task status \n"
                +"1) To DO\n"
                +"2) Doing\n"
                +"3) Done");
        
    }
    public static String getStatus(){
        return Status;
    }
    
    //only applicable once user has successfully logged in
    public static void WelcomeNote(){
        int option;
        int end = 0;
        
        Login log = new Login();
        Task obj = new Task();
        
        if(log.loginUser()){
            
            do{
                option = Integer.parseInt(JOptionPane.showInputDialog("Welcome TO Easykanban\n"
                + "Please select an option \n"
                        + "1. Add task \n"
                        + "2. Show report \n"
                        + "3. Quit \n"));
                
                if(option ==1 ){
                    setNumberOfTask();
                    for(int count = 0; count<getNumberOfTask(); count++){
                        setStatus();
                        setTaskNumber(count);
                        setTaskName();
                        setDescription();
                        setDuration();
                        setDeveloperNames();
                        
                        duration = duration+ getDuration();
                        JOptionPane.showMessageDialog(null, obj.printTaskDetails());
                    
                        
                }
                        JOptionPane.showMessageDialog(null, "These tasks will take "+ duration + " hours to implement.");
                        
                        continue;
                    }
                    else if(option ==2){
                            JOptionPane.showMessageDialog(null, "Coming soon");
                            continue;
                            }
                    else if(option ==3){
                         
                        end = 3;
                    }
                } while(end !=3);
            
        }
    }
}
