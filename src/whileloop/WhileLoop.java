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
