/*Ryan Crothers
 */


import java.util.Scanner;

/* use parameter???? for root1 and root2
 * fix when a is large
 */

public class math {
	
	public static double[] quadraticFormula(a, b, c) throws ArithmeticException {
	    double root1 = 0;
	    double root2 = 0;
	    
	  

	    double discriminant = (b * b) - (4 * a * c);
	    
	    if (Double.isNaN(discriminant)) {
	        throw new ArithmeticException(discriminant + " is not a number!");
	    }

	    if (discriminant > 0) {
	        //Two roots
	        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	        root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	    } else if (discriminant == 0) {
	        //One root
	        root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	    } else if (discriminant < 0) {
	        //Imaginary roots
	    }

	    return new double[] { root1, root2 };
	    
	}
	

	

	public static void main(String[] args) {


		double a;
		double b;
		double c;
		
		Scanner valueIn = new Scanner (System.in);
	    
		System.out.println("ax^2 + bx + c");
	    
		System.out.println("\n a = ?");
		a = valueIn.nextInt(); 
		
		System.out.println(" b = ?");
		b = valueIn.nextInt(); 
		
		System.out.println(" c = ?");
		c = valueIn.nextInt(); 
			
		valueIn.close();
		
		System.out.print(quadraticFormula(a,b,c));
		
		
		
	
		
		
		
		
		
		
		
		
		/* Scanner in = new Scanner(System.in); 
		
			double a = 15;
			double b = 4;
			double c = 4;
			
			double d = Math.sqrt((b*b)-(4*a*c));
				
			double root1d;
			String factor1;
			root1d = (-b) + d;
			root1d = root1d/(2*a);
			
			int root1 = 0;
			if (root1d % 1 == 0) {
				root1 = (int)root1d;
			}
			
				if (root1 > 0) {
					factor1 = "(x - " + Math.abs(root1) + ")";
				}
				else if (root1 < 0) {
					factor1 = "(x + " + Math.abs(root1) + ")";
				}
				else if (root1 == 0){
					factor1 = "(x)";
				}
				else {
					factor1 = "ERROR";
				}
	
			double root2d;
			String factor2 = "";
			root2d = (-b) - d;
			root2d = root2d/(2*a);
			
			int root2 = 0;
			if (root2d % 1 == 0) {
				root2 = (int)root2d;
			}
			
				if (root2 > 0) {
					factor2 = "(x - " + Math.abs(root2) + ")";
				}
				else if (root2 < 0) {
					factor2 = "(x + " + Math.abs(root2) + ")";
				}
				else if (root2 == 0){
					factor2 = "(x)";
				}
				else {
					factor1 = "ERROR";
				}
			
			System.out.println("Roots: ");
			System.out.println(factor1 + factor2);
			
			System.out.println();
			*/
			
		
		if an integer which currently has a decimal preceeding an operation, the decimal stays, but if you are taking doubnle or something and turning it into an integer, i think you just round normally, i.e. 5 goes up and everything below goes down, otherwise i believe you truncate
		
		
	}
	

}
