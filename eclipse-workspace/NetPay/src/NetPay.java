import java.util.Scanner;

public class NetPay {

	public static void main(String[] args) {
		
		double ROP;
		double hours;
		int ID;
		
		double gross;
		double NIS;
		double net;
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter Rate of Pay:");
		ROP = keyIn.nextDouble();
		
		System.out.println("Enter Hours Worked:");
		hours = keyIn.nextDouble();
		
		System.out.println("Enter ID Number:");
		ID = keyIn.nextInt();
		
		gross = ROP * hours;
		NIS = 0.15 * gross;
		
		net = gross - NIS;
		
		System.out.println("\nEmployee ID: " + ID);
		System.out.println("Net Pay: " + net);
		
		keyIn.close();

	}

}
