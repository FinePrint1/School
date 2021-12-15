import java.util.Scanner;

public class Selection2 {

	public static void main(String[] args) {
		
		int number;
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter the number");
		number = keyIn.nextInt();
		
		if (number >= 1 && number <= 7) {
			System.out.print(days[number-1]);
		}
		
		keyIn.close();
	}

}
