
public class DemoOutput2 {

	public static final double RATE = 0.5;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Java Programming ");
		System.out.println("Java Program Demonstration ");
		
		String name = "John Happy";
		int accNumber = 27153;
		double accBalance = 100.00;
		double accInterest;
		
		accInterest = accBalance * RATE;
		System.out.print("Name: " + name);
		System.out.print("/t Account Number: " + accNumber);
		System.out.print("/nBalance: ");
		System.out.printf("$ % 6.2f", accBalance);
		System.out.println("/t Interest: " + accInterest);
	}

}
