package mathClass;

import java.util.Scanner;

public class MethodDemo3 {
	
	public static double addition (double num1, double num2) {
		return(num1 + num2);
	}
	public static double subtraction (double num1, double num2) {
		return(num1 - num2);
	}
	public static double multiplication (double num1, double num2) {
		return(num1 * num2);
	}
	public static double division (double num1, double num2) {
		return(num1 / num2);
	}
	
	public static int Menu() {
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
	public static void endOfProcessing() {
		System.out.println("\n\tEnd of Processing\n");
	}


	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		double num1, num2, myanswer;
		
		int choice = Menu();
		
		while (choice != 0) {
				switch (choice) {
					case 1: {
						System.out.println("Enter the values to be summed: ");
						num1 = keyboard.nextDouble();
						num2 = keyboard.nextDouble();
						myanswer = addition(num1, num2);
						System.out.println("Answer = " + myanswer);
						
						break;
					}
					case 2: {
						System.out.println("Enter the values to be subtracted: ");
						num1 = keyboard.nextDouble();
						num2 = keyboard.nextDouble();
						myanswer = subtraction(num1, num2);
						System.out.println("Answer = " + myanswer);
						
						break;
					}
					case 3: {
						System.out.println("Enter the values to be multiplied: ");
						num1 = keyboard.nextDouble();
						num2 = keyboard.nextDouble();
						myanswer = multiplication(num1, num2);
						System.out.println("Answer = " + myanswer);
						
						break;
					}
					case 4: {
						System.out.println("Enter the values to be divided: ");
						num1 = keyboard.nextDouble();
						num2 = keyboard.nextDouble();
						if (num2 != 0) {
							myanswer = division(num1, num2);
							System.out.println("Answer = " + myanswer);
						}
						else {
							System.out.println("Error: Division by 0");
						}
						
						break;
					}
					
					default: {System.out.print("\n\tError in input");
					}
				}
				choice = Menu();
		}
		endOfProcessing();
	}
}
	

		
		
		
		
		
		
		
		
		
		
		