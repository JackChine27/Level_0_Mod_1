package variables_and_conditionals;

/** 
I have a pocket full of change. I hate doing math. Make me a program that will calculate 
how much money I have without me having to use my brain.
*/

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have

    String totalNickels=JOptionPane.showInputDialog("How many nickels do you have?");
    
    	
        // Convert their answer to an int using Integer.parseInt()

    	int nickels=Integer.parseInt(totalNickels);
    	
        // Ask the user how many dimes they have, and convert their answer

    	String totalDimes=JOptionPane.showInputDialog("How many dimes do you have?");
    	int dimes=Integer.parseInt(totalDimes);
    	
        // Ask the user how many quarters they have, and convert their answer

    	String totalQuarters=JOptionPane.showInputDialog("How many quarters do you have?");
    	int quarters=Integer.parseInt(totalQuarters);
    	
        // Calculate how much money the user has and save it in a double variable 

    double totalNickel=nickels*0.05;
    double totalDime=dimes*0.1;
    double totalQuarter=quarters*0.25;
    double total=totalQuarter+totalDime+totalNickel;
    	
        // Tell the user how much money they have
   
    	JOptionPane.showMessageDialog(null, "You have a total of "+total+" dollars");
    
    	
    }
    
   
    
    }
