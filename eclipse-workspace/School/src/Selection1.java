import java.util.Scanner;

public class Selection1 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter the number");
		number = keyIn.nextInt();
		
		if((number % 2) == 0) {
			System.out.println(number + " is even");
		}
		else 
			System.out.println(number + " is odd");
		
		keyIn.close();
	}

}
