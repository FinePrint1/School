import java.util.Scanner;

public class SalesCommission {

	public static void main(String[] args) {
		
		double salesAmount;
		int percentCommission = 0;
		double commission;
		
		Scanner keyIn = new Scanner (System.in);
		
		System.out.println("Enter Sales Amount in Dollars: ");
		salesAmount = keyIn.nextInt();

		if (salesAmount >= 100 && salesAmount <= 999){
			percentCommission = 1;
		}
		else if (salesAmount >= 1000 && salesAmount <= 9999) {
			percentCommission = 5;
		}
		else if (salesAmount >= 10000 && salesAmount <= 99999) {
			percentCommission = 10;
		}
		else {
			percentCommission = 0;
			
			System.out.println("\nSales Amount Not Within Applicable Range");
		}
		
		commission = salesAmount * (0.01 * percentCommission);
		
		System.out.println("\nSales Amount \t\t Percentage Commission \t\t Commission in $");
		System.out.print("$" + salesAmount + " \t\t\t " + percentCommission + "%" + " \t\t\t\t $" + commission);
		
		keyIn.close();
	}

}