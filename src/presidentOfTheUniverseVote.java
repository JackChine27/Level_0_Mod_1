
//1. Voting Machine: 	There are two people running for president of the universe: Dwayne "The Rock" Johnson and Bill Nye the Science Guy.
//We want to make a voting machine that calculates the winner of the universe.
//*1 First, ask the user to enter in how many people will be voting. 
//*2 Make a for loop run that many times.
//*3 Each iteration of the loop will ask for another vote.
//*4 At the end of the loop, display who got the most votes and who will inherit everything in existence!
import javax.swing.JOptionPane;

public class presidentOfTheUniverseVote {
	public static void main(String[] args) {
		int theRock=0;
		int billNye=0;
		String voters=JOptionPane.showInputDialog("How many people will be voting?");
		int voteCount=Integer.parseInt(voters);
		for (int i = 0; i < voteCount; i++) {
			String theRockOrBillNye=JOptionPane.showInputDialog("Please insert a vote. The Rock or Bill Nye?");
			if(theRockOrBillNye.equals("The Rock")) {
				theRock++;
			}
			
			else if(theRockOrBillNye.equals("Bill Nye")) {
				billNye++;
			}
			else {
				JOptionPane.showMessageDialog(null, "That person isn't a candidate.");
			}
		}
			if(theRock>billNye) {
				JOptionPane.showMessageDialog(null, "Dwayne 'The Rock' Johnson is now the president!");
			}
			if(billNye>theRock) {
				JOptionPane.showMessageDialog(null, "Bill Nye the Science Guy is now the president!");
			}
			if(billNye==theRock) {
				JOptionPane.showMessageDialog(null, "The Rock and Bill Nye have tied!");
			}
			
			
		

	}

}
