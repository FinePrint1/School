import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		double n1;
		double n2;
		double n3;
		double n4;
		double n5;
		
		double average;
		
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter numbers: ");
		n1 = keyIn.nextInt();
		n2 = keyIn.nextInt();
		n3 = keyIn.nextInt();
		n4 = keyIn.nextInt();
		n5 = keyIn.nextInt();

		if (n1<=100 && n1>=0  &&  n2<=100 && n2>=0  &&  n3<=100 && n3>=0  &&  n4<=100 && n4>=0  &&  n5<=100 && n5>=0) {
		
		average = (n1 + n2 + n3 + n4 + n5)/5;
		
		System.out.println("Average: \n\n" + average);
		}
		else {
			System.out.println("Number not within range");
		}
		
		keyIn.close();
	}

}