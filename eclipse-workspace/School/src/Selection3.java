import java.util.Scanner;

public class Selection3 {

	public static void main(String[] args) {
		
		final int MINOR = 21;
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println("Enter guest age ");
		int age = keyIn.nextInt();
		
		if (age < MINOR) {
			System.out.println("This guest cannot be served alcohol");
		}
		else {
			System.out.println("This guest can be served alcohol");
			System.out.println("The bartender can call guests cabs if one is required");
		}
		
		keyIn.close();
		System.out.println("End of Processing");
	}

}
