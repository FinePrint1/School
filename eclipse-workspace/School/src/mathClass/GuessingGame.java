package mathClass;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
		int numToGuess;
		int guess;
	
		Scanner scan = new Scanner(System.in);

		Random generator = new Random();
		numToGuess = generator.nextInt(10) + 1;

		System.out.println("Enter a guess:");
		guess = scan.nextInt();
		
		while (guess != numToGuess) {
			System.out.println("Incorrect Guess - Try Again:");
			
			guess = scan.nextInt();
		}
		
		System.out.println("Congratulations! Your Guess Was Correct!");
		
		scan.close();
	}
}