import java.util.Scanner;
import java.text.NumberFormat;

public class Ch6Lab2 {

	public static void main(String[] args) {
		//Declarations
		String status;
		int hours;
		double rate, tuition=0;
		Scanner keyboard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		// Create a do while loop that runs once and repeats only if "p" or "f" is not entered
		
		do
		{
			System.out.println("Enter P for part time or F for full time student");
			status = keyboard.next();
			if(status.equalsIgnoreCase("P"))
			{
				System.out.println("Enter the number of hours you will be taking");
				hours = keyboard.nextInt();
				rate = 50.00;
				tuition = rate * hours;
			}
			else
			tuition = 540.00;
		}
		
		while(!status.equalsIgnoreCase("P") && !status.equalsIgnoreCase("F"));
		
		System.out.println("Your tuition for this semester is "+ currency.format(tuition));
	}

}
