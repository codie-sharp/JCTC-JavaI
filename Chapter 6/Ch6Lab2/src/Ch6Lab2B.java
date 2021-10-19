import java.util.Scanner;
import java.text.NumberFormat;

public class Ch6Lab2B {
	
	public static int getChoice() {
		int choice;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nWhat is your current status?\n\n1)Part time\n2)Full time\n");
		choice = keyboard.nextInt();
		return choice;
	}
	
	public static double getTuition(int choice) {
		int hours;
		double rate, tuition = 0;
		Scanner keyboard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		switch(choice)
		{
			case 1:
			System.out.println("\nHow many hours are you taking?");
			hours = keyboard.nextInt();
			rate = 50.00;
			tuition = rate * hours;
			System.out.println("\nYour tuition for this semester is " +
			currency.format(tuition));
			break;
			
			case 2:
			tuition = 540.00;
			System.out.println("\nYour tuition for this semester is " +
			currency.format(tuition));
			break;
			
			default:
			System.out.println("\nError has occurred. You must choose either 1 or 2");
			break;
		}
		
		return tuition;
	}

	public static void main(String[] args) {
		//Delcarations
		String answer;
		int choice, hours, scholarship = 0;
		double rate, tuition;
		boolean quitProgram = false;
		Scanner keyboard = new Scanner(System.in);
		
		do
		{
			choice = getChoice();
			tuition = getTuition(choice);
			
			while(scholarship == 0 || scholarship > 2)
			{
				System.out.println("\nIs your salary less than $20,000 a year? Enter:\n\n1) Yes\n2) No\n");
				scholarship = keyboard.nextInt();
				
				switch(scholarship)
				{
					default:
					System.out.println("\nYour answer must be either Yes or No. Please try again.");
					break;
					
					case 2:
					System.out.println("\n\nSorry you do not qualify for financial aid this year.\nApply again next year, the earlier the better.");
					break;
					
					case 1:
					System.out.println("\n\nCongratulations! You qualify for financial aid.\nPlease visit our Financial Aid office soon.");
					break;
				}
			}
			
			keyboard.nextLine();
			System.out.println("\n\nDo you want to quit the program? Please enter either true or false\n");
			answer = keyboard.nextLine();
			quitProgram = Boolean.parseBoolean(answer);
				
			if(quitProgram == false)
				scholarship = 0;
		}
		
		while(quitProgram == false);
	}
}
