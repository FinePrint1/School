import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		
		int number;
		String[] digitInWords = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter the number");
		number = keyIn.nextInt();
		
		if (number >= 1 && number <= 9) {
			System.out.print(digitInWords[number-1]);
		}
		
		keyIn.close();
	}

}
