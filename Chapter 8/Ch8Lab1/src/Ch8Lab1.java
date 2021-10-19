/*Codie Sharp
11/3/20
The purpose of this class is to determine whether a
car(s) need maintenance based on the miles driven and how many months since the car
last receive general maintenance.  
*/
import java.util.Scanner;

public class Ch8Lab1 {

	public static void main(String[] args) {
		int size;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many cars will you enter? ");
		size = keyboard.nextInt();
		
		int[] stockNumber = new int[size];
		String[] autoVenNumber = new String[size];
		double[] milesDriven = new double[size];
		double[] lastServiced = new double[size];
		double[] excessMilesDriven = new double[size];
		double[] excessMonths = new double[size];
		final double MILE_LIMIT = 10000;
		final double MONTH_LIMIT = 6;
		
		for (int i = 0; i < size; i++) {
			System.out.println("What is the stock number of car #" + (i+1) + ": ");
			stockNumber[i] = keyboard.nextInt();
			System.out.println("What is the vendor number on car #" + (i+1) + ":");
			autoVenNumber [i]= keyboard.next();
			System.out.println("How many months has it been since car #" + (i+1) + " was last serviced: "); 
			lastServiced[i] = keyboard.nextDouble();
			System.out.println("What are the number of miles driven since car #" + (i+1) + " was last serviced: "); 
			milesDriven[i] = keyboard.nextDouble();
		
			if(milesDriven[i] > MILE_LIMIT) {
				excessMilesDriven[i] = milesDriven[i] - MILE_LIMIT;
			}
			else {
				excessMilesDriven[i] = 0;
			}
			if(lastServiced[i] > MONTH_LIMIT) {
				excessMonths[i] = lastServiced[i] - MONTH_LIMIT;
			}
			else {
				excessMonths[i] = 0;
			}
		}
		
		for (int i = 0; i < size; i++) {
			if ((excessMilesDriven[i] > 100) && (excessMonths[i]==0)) {
				System.out.println(stockNumber[i] + " Maintenance Schedule A");
			}
			else if ((excessMilesDriven[i] > 100) && (excessMonths[i] >0)) {
				System.out.println("Car " + stockNumber[i]+ " Maintenance Schedule B");
			}
	
			else{
				System.out.println("Car " + stockNumber[i] + " Needs no maintenance at this time");
			}
		}

	}
}
