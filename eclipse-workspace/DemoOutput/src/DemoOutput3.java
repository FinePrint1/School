
public class DemoOutput3 {

	public static void main(String[] args) {
		
		double cost = 62.5;
		String book = "Language for Living";
		
		System.out.println("Demo Output 1");
		System.out.print("$");
		System.out.printf("% 6.2f", cost);
		System.out.println("\t Thank you");
		
		System.out.println("\nDemo Output 2");
		System.out.printf("$% 6.2f for each copy of %s", cost, book);
		System.out.println("\t Thank you");
	}

}
