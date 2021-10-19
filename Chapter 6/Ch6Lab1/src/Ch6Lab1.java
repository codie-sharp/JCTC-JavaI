/*
 * Codie Sharp
 * 10/6/20
 * Use while loop to prompt user for input until user quits
 */
import java.util.Scanner;

public class Ch6Lab1 {

	public static void main(String[] args) {
		double salary;
		String answer;
		boolean quitProgram = false;
		
		Scanner keyboard = new Scanner(System.in);
		while(quitProgram == false)
		{
			System.out.println();
			System.out.println("Enter your current monthly salary");
			salary = keyboard.nextDouble();
			
			if(salary >= 4700)
				 System.out.println("A salary of $"+salary+ " isn't chicken feed");
			
			else if(salary >=2100.00 && salary <4700.00)
				 System.out.println("A salary of $"+salary+ " isn't too bad. Could be better");
			else
				 System.out.println("You need a raise!");
			
			System.out.println("End program? Enter Y or N");
			answer = keyboard.next();
			if(answer.equalsIgnoreCase("Y"))
			{
			 quitProgram = true;
			}		}
	}
}
