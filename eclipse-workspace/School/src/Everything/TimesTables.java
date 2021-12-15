package Everything;


import java.util.Scanner;

public class TimesTables {

	public static void main (String [] args) {
		
		int [] table = new int [12];
		int multiplier;
		
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter a number to generate a times table: ");
		
		multiplier = keyIn.nextInt();
		
		for (int i = 0; i < table.length; i++) {
			table[i] = i * multiplier;
			System.out.print(table[i] + " ");
		}
		
		keyIn.close();
	} 
} 