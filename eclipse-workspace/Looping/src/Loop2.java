
public class Loop2 {
	
	public static void main(String[] args) {
		
		final int LIMIT = 0;
		int count = 10;
		
		System.out.println("do...while Loop Demonstration");
		do {
			System.out.println(count);
			count--;
		} while (count > LIMIT);
		System.out.println("End of Processing");
	}
}