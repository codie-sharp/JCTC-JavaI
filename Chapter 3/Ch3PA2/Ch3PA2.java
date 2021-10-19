import java.util.Scanner; //Import for user input
import java.text.DecimalFormat; //Import for currency formatting

public class Ch3PA2 {

	public static void main(String[] args) {
		
		//Get number of coins and values
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of quarters > ");
		int quarters = input.nextInt();
		double qValue = quarters*.25;
		
		System.out.println("Enter the number of dimes >");
		int dimes = input.nextInt();
		double dValue = dimes*.10;
		
		System.out.println("Enter the number of nickels >");
		int nickels = input.nextInt();
		double nValue = nickels*.05;
		
		//Add values and display in currency format
		DecimalFormat cashValue = new DecimalFormat("$#.##");
		double totalValue = qValue + dValue + nValue;
		System.out.println("The amount is "+cashValue.format(totalValue));		
	}

}
