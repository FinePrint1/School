import java.util.Scanner;
import java.util.*;

public class random1 {
	
//	static void visualizeMatrix(int c, int r) {
//		
//		if (c>0 && r>0) {
//			System.out.print("-");
//		}
//			
//		int cDis = c;
//		while (cDis>0) {
//			System.out.print("------");
//			cDis--;
//		}
//		
//		int rDis = r;
//		while (rDis>0) {
//			System.out.print("\n");
//			System.out.print("|");
//			
//			cDis = c;
//			while (cDis>0) {
//				System.out.print("     |");
//				cDis--;
//			}
//			
//			System.out.print("\n");
//			System.out.print("|");
//			
//			cDis = c;
//			while (cDis>0) {
//				System.out.print("     |");
//				cDis--;
//			}
//			
//			System.out.print("\n");
//			System.out.print("-");
//			
//			cDis = c;
//			while (cDis>0) {
//				System.out.print("------");
//				cDis--;
//			}
//			
//			
//			rDis--;
//		}
//	}

	public static void main(String[] args) {
		
//		System.out.println("-------------------");
//		System.out.println("|     |     |     |");
//		System.out.println("|( , )|( , )|( , )|");
//		System.out.println("-------------------");
//		System.out.println("|     |     |     |");
//		System.out.println("|( , )|( , )|( , )|");
//		System.out.println("-------------------");
//		System.out.println("|     |     |     |");
//		System.out.println("|( , )|( , )|( , )|");
//		System.out.println("-------------------");
		
//		visualizeMatrix(3, 3);
		
		int c;
		int r;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter Number of Columns:");
		c = scan.nextInt();
		
		System.out.println("Enter Number of Rows:");
		r = scan.nextInt();
		
		int listL = c * r;
		
		ArrayList<Integer> rPayoffs = new ArrayList<Integer>(listL);
		ArrayList<Integer> cPayoffs = new ArrayList<Integer>(listL);
		
		int payoffInput;
		int rPoIndex;
		int cPoIndex;
		
		for (int rIn=r; rIn>0; rIn--) {
			rPoIndex = r - rIn;
			System.out.println("r" + (rPoIndex + 1) + ": ");
			payoffInput = scan.nextInt();
			rPayoffs.add(rPoIndex, payoffInput);
		}
		
		System.out.println("");
		
		for (int cIn=c; cIn>0; cIn--) {
			cPoIndex = c - cIn;
			System.out.println("c" + (cPoIndex + 1) + ": ");
			payoffInput = scan.nextInt();
			cPayoffs.add(cPoIndex, payoffInput);
		}
		
		System.out.println(rPayoffs);
		System.out.println(cPayoffs);
		
		
		if (c>0 && r>0) {
			System.out.print("-");
		}
			
		int cDis = c;
		while (cDis>0) {
			System.out.print("------");
			cDis--;
		}
		
		String payoffSpace;
		
		
		
		cPoIndex = 0;
		rPoIndex = 0;
		int rDis = r;
		while (rDis>0) {
			
//			payoffSpace = Integer.toString (rPayoffs.get(rPoIndex) + cPayoffs.get(cPoIndex));
//			int space = payoffSpace.length
			
			// count number of digits in each entry, add them together, and subtract that number of spaces from the visualization
			
			System.out.print("\n|");
			
			cDis = c;
			while (cDis>0) {
				System.out.print("     |");
				cDis--;
			}
			
			System.out.print("\n|");
			
			cDis = c;
			while (cDis>0) {
				System.out.print("(" + rPayoffs.get(rPoIndex) + "," + cPayoffs.get(cPoIndex) + ")|");
				rPoIndex++;
				cDis--;
			}
			
			System.out.print("\n-");
			
			cDis = c;
			while (cDis>0) {
				System.out.print("------");
				cDis--;
			}
			
			
			rDis--;
		}
		
		scan.close();
	}

}
