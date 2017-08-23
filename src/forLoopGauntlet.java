import javax.swing.JOptionPane;
//1. Display all numbers from 0 to 100

//2. Display all numbers from 100 to 0
//3. Display all even numbers from 2 to 100
//4. Display all odd numbers from 1 to 99
//5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
//	Ex:	1 odd
//		2 even
//		3 odd
//		4 even
//		5 odd...etc.
//6. Display all multiples of 7 from 0 to 777.
//7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)

public class forLoopGauntlet {
public static void main(String[] args) {
	//for (int i = 0; i < 101; i++) {
	//	System.out.println(i);
	//}
	
	
	//for (int i = 100; i >= 0; i--) {
		//System.out.println(i);
		//try {
			//Thread.sleep(1000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		
	
	//for (int i = 2; i < 100; i++) {
		//if(i%2==0) {
			//System.out.println(i);
			//try {
				//Thread.sleep(1000);
			//} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		
	
	for(int i = 1; i < 101; i=i+2) {
		if(i%2==1) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}		}
		}
	 
		
	





}

	
	
	


