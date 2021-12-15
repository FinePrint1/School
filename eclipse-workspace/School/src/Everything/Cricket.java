package Everything;

import java.util.Scanner; 

public class Cricket { 
	// code to implement method playerandRuns
	public static void playerandRuns(int[] a, String[] b) {
		//traverse print
	}
	// code to implement method teamTotal
	public int teamTotal(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
	}
	// code to implement method lowScore 
	public int lowScore() {
		
	}
	// code to implement method highScore
	public int highScore() {
		
	}
	// code to implement method secondhighScore
	public int secondHighScore() {
		
	}

	public static int Menu(){ 
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("\n" +
			"\t1. Add two numbers \n" +
			"\t2. Subtract two numbers \n" +
			"\t3. Multiply two numbers \n" +
			"\t4. Divide two numbers \n" +
			"\tMake a selection or 0 to end processing \n"
		);
		return(keyboard.nextInt()); 
	} 
	public static void endOfProcessing(){ 
		System.out.println ("\n \t End of Processing \n"); 
	} 
	public static void main(String [] args){ 
		
		int Runs[] = {54, 93, 26, 12, 85, 77, 127, 68, 51, 98, 37};
		String Names[] = {"Larry Cummings", "Bill Hassel", "Simon Williams", "Don Worrell", "Darrian Weeks", "Neal Wolcott", "Brian Lara", "Anthony Ambrose", "Bernard Cummings", "Dennis Young", "Kamal Tandukar"};
		Scanner keyboard = new Scanner(System.in); 
		//declare a one dimensional array called list that store the following test data  16, 55, 24, 8, 12, 33. NOTE These items are test data and can change  during testing of your code and grading. 
		int choice = Menu(); 
		switch (choice) { 
		case 1: {
			playerandRuns(Runs, Names);
			break;
		}
		case 2: { // call the method to perform teamTotal 
			break; 
		} 
		case 3: { // call the method to perform lowScore 
			break; 
		} 
		case 4: { // call the method to perform highScore
			break; 
		} 

		case 5: { // call the method to perform secondhighScore

			break; 
		} 
		default :{ System.out.print("\n \t Error in input");  
		} 
		} // end of switch ... case statement 
	}// end of main method 
}// end of class
