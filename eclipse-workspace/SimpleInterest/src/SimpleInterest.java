import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		double P;
		double R;
		int T = 0;
		
		double I;
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter the Principal:");
		P = keyIn.nextDouble();
		
		System.out.println("Enter the Rate:");
		R = keyIn.nextDouble();
		
		System.out.println("Enter the Time (in years):");
		T = keyIn.nextInt();
		
		I = (P * R * T)/100;
		
		System.out.print("\n" + I);
		
		keyIn.close();

	}

}
