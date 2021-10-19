/*
 * Date: 9/30/20
 * Programmer: Codie Sharp
 * Purpose: Validate user date input
 */
import java.util.Scanner;

public class Ch5Lab2 {

	public static void main(String[] args) {
		int month, day, year;
		boolean leapYear;
		String monthStr = "";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a month as an integer e.g. 1 for January, etc.");
		month = keyboard.nextInt();
		System.out.println("Please enter a day");
		day = keyboard.nextInt();
		System.out.println("Please enter a year");
		year = keyboard.nextInt();
		
		switch(month)
		{	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day < 1 || day > 31)
			{
				System.out.println("The day you entered is invalid. This month has 31 days.");
				System.exit(0);
			}
			else
				System.out.print("This is a valid day for the month of ");
			if(month == 1)
				monthStr = "January";
			else if(month == 3)
				monthStr = "March";
			else if(month == 5)
				monthStr = "May";
			else if(month == 7)
				monthStr = "July";
			else if(month == 8)
				monthStr = "August";
			else if(month == 10)
				monthStr = "October";
			else
				monthStr = "December";
			System.out.println(monthStr);
			break;
			
			case 2:
			leapYear = (year%400 == 0) || ((year%4 == 0) && (year%100 != 0));
			if(leapYear && day > 29)
			{
				System.out.println("Error: Leap years can have no more than 29 days.");
			}
			else if(!leapYear && day > 28)
			{
				System.out.println("Error: This is not a leap year. The day must be less than 29.");
			}
			else if(leapYear && (day >= 1 && day <= 29))
				System.out.println("This is a valid day for February in a leap year.");
			else if(day < 1)
				System.out.println("Error: The day must be 1 or higher.");
			else
				System.out.println("This is a valid day for February.");
			break;
			
			case 4: case 6: case 9: case 11:
			if(day < 1 || day > 30)
			{
				System.out.println("The day you entered is invalid. This month has 30 days");
				System.exit(0);
			}
			else
				System.out.print("This is a valid day for the month of ");
			if(month == 4)
				monthStr = "April";
			else if(month == 6)
				monthStr = "June";
			else if(month == 9)
				 monthStr = "September";
			else
				monthStr = "November";
			System.out.println(monthStr);
			break;
			
			default:
				System.out.println("You have entered an invalid month. Months range from 1-12. The program will now end.");
				System.exit(0);
			
		}
	}

}
