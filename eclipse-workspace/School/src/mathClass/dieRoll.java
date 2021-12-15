package mathClass;

import java.util.Random;
import java.util.Scanner;

public class dieRoll {
	public static void main(String[] args) {
		
		int face[] = {0, 0, 0, 0, 0, 0};
		
		int faceNum;
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter the number of trials:");
		int trials = keyIn.nextInt();
		
		Random ranGen = new Random();
		
		for (int t = trials; t > 0; t--) {
			faceNum = ranGen.nextInt(6) + 1;
			
			switch(faceNum) {
			case 1:
				face[0]++;
				break;
			case 2:
				face[1]++;
				break;
			case 3:
				face[2]++;
				break;
			case 4:
				face[3]++;
				break;
			case 5:
				face[4]++;
				break;
			case 6:
				face[5]++;
				break;
			}
		}
		
		System.out.println("\n" + "Trials: " + trials);
		
		System.out.println("\n" + "Number of Faces Rolled:");
		System.out.println(
			"Ones: "   + face[0] + "\n" +
			"Twos: "   + face[1] + "\n" +
			"Threes: " + face[2] + "\n" +
			"Fours: "  + face[3] + "\n" +
			"Fives: "  + face[4] + "\n" +
			"Sixes: "  + face[5]
		);
		
	keyIn.close();
	}
}
