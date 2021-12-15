import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		Scanner keyIn = new Scanner(System.in);
		
		System.out.println("Enter student's mark: ");
		double mark = keyIn.nextInt();
		
		System.out.println("Enter student's ID number: ");
		int id = keyIn.nextInt();
		
		System.out.println("\nID: " + id);
		
		if (mark <= 49) {
			System.out.println("Grade: " + "U");
			System.out.println("Standing: " + "ungraded");
		}
		else if (mark <= 65) {
			System.out.println("Grade: " + "C");
			System.out.println("Standing: " + "pass");
		}
		else if (mark <= 79) {
			System.out.println("Grade: " + "B");
			System.out.println("Standing: " + "credit");
		}
		else if (mark <= 100) {
			System.out.println("Grade: " + "A");
			System.out.println("Standing: " + "distinction");
		}
		else {
			System.out.println("Mark not in range");
		}
		
		keyIn.close();
	}

}
