import java.util.Scanner;

public class DemoInput1 {

	public static void main(String[] args) {
		
		String subjectName;
		int subjectCode;
		double subjectCost;
		
		// creates object called keyIn of class Scanner
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter the Subject Code");
		subjectCode = keyIn.nextInt(); // reads integer data from the keyboard
		
		System.out.println("Enter the Subject Cost");
		subjectCost = keyIn.nextDouble(); // reads real data from the keyboard
		
		System.out.println("Enter the Name of the subject: \t");
		subjectName = keyIn.next();
		
		System.out.println("Subject Code: " + subjectCode);
		System.out.println("Subject Cost: " + subjectCost);
		System.out.println("Subject Name: " + subjectName);
		
		keyIn.close();

	}

}
