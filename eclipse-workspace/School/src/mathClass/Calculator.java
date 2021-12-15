package mathClass;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String output = "";
		
		String expression = "";
		double answer;
		double a;
		double b;
		String operator = "";
		
		Scanner keyIn = new Scanner (System.in);

		
		
		System.out.println("Input the variables and operators \nwith the precendence of the operator from left to right, \ninclude spaces inbetween values and operators:");
		
		expression = keyIn.nextLine();
		
		for(int i = 0; i < expression.length(); i++) {
			if (expression[i] == "=") {
				answer = a;
				break;
			}
		}
		
		
		
		keyIn.close();
	}

}
