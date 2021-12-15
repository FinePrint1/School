package mathClass;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		
		double num = 0;
		double average = 0;
		int v;

		Scanner keyIn = new Scanner (System.in);
		
		for (v = 1; v <= 5; v++) {
			System.out.println("Enter number " + v + ":");
			num = keyIn.nextInt();
			
			if (num >= 0 && num <= 100) {
				average += num;
			}
			else {
				System.out.println("Number not in range!");
				break;
			}
		}
		
		if (v > 5) {
			average = average / 5;
			System.out.print("Average: " + average);
		}
		
		keyIn.close();
	}
}
