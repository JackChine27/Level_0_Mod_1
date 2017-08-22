package variables_and_conditionals;

import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XGeeks {
public static void main(String[] args) {

        // 1. Save the superpower for each person in a variable.

	String power="being really tall.";
	
        // 2. Ask the user to enter a name. Store their answer in a variable.

	String ans=JOptionPane.showInputDialog("Enter a name.");
	
        // 3. Show the superpower in a pop-up, depending on the name entered. 

	String jack="Jeff";
	if(ans.equalsIgnoreCase(jack)) {
		JOptionPane.showMessageDialog(null, ans+"'s power is "+power);
    }
	else {
		JOptionPane.showMessageDialog(null, ans+" has no powers.");
}
}}