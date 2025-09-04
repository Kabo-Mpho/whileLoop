/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileloop;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hi there, welcome to the App");
        System.out.println("==========================");
        System.out.println("Please select an option and press Enter");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        
        int option = scanner.nextInt();
        switch(option){
            case 1:
                //registration code 
                System.out.println("Hi Hi, please enter your email");
                String email = scanner.nextLine();
                scanner.next();
                System.out.println("Please enter your password");
                String password = scanner.nextLine();
                scanner.next();
                String output = obj.Registration(email, password);
                System.out.println(output);
                break;
            case 2: 
                //login code
                System.out.println("To login........");
                System.out.println("Please enter your email");
                String enteredEmail = scanner.nextLine();
                System.out.println("Please enter your password");
                String enteredPassword = scanner.nextLine();
                Boolean IsLogin = obj.Login(enteredEmail, enteredPassword);
                if (IsLogin){
                    System.out.println("You have logged in successfully");
                }else{
                    System.out.println("Login attempt failed! Please verify your credentials");
                }
                break;
            case 3:
                // exit code
                break;
            default:
                System.out.println("You have selected an invalid option!");
                
        }
        int state = 0;
        int counter = 1;
        while (state == 0){//begin loop
            JOptionPane.showMessageDialog(null, "Loop number: " + counter);
            counter++;
            //local integer variable

            int choice = Integer.parseInt(JOptionPane.showInputDialog("Do you want to continue? \n 1= No, 0 = Yes"));
            switch(choice){
                case'0':
                    break;
                case'1':
                    JOptionPane.showMessageDialog(null, "User terminated the program");
                    state = choice;
                  break;
                  
                default:
                    JOptionPane.showMessageDialog(null, "Wrong input");
                    
            }//end of switch
             
        }//end of while loop
        // TODO code application logic here
    }//end of main
    
}//end of class
