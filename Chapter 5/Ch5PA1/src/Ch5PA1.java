import java.util.Scanner;

public class Ch5PA1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int year;
		
		System.out.println("Enter a year > ");
		year = keyboard.nextInt();
		
		if(year < 100 && year > 0)
			System.out.println("The year is 20" + year);
		
		else
			System.out.println("The year is " + year);
	}

}
