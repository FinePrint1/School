package Everything;

import java.sql.Date;
import java.util.Scanner;

public class DateDemo {
	
	public static void main(String[] args) {
		
		Date Date1 = new Date();
		Date Date2 = new Date();
		Date1.displayOutput();
		Date2.displayOutput();
		
		System.out.println("\nToday is: " + java.time.LocalDate.now());
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter today's date in the format month, day, and year");
		int month = keyboard.nextInt();
		int day = keyboard.nextInt();
		int year = keyboard.nextInt();
		Date1.setDate(month, day, year);
	}
}
