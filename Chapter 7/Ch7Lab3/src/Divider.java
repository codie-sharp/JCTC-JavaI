/**
This lab consists of two separate classes. One class contains all the methods for processing
actions, and returning values to the main program. The Divider class contains all of the methods that process information. The reason for
this class being separate is so that the methods can be used by multiple programs if
desired. 
 */

/**
 * @author codie
 * 10/30
 */
import java.util.Scanner;

public class Divider {
	private int divider;
	private double correct;

	public void welcome() {
	 System.out.println("\nTest your skills at Division without using a calculator");
	}
	
	public int getDivider() {
	 Scanner keyboard = new Scanner(System.in);
	 System.out.println("\nEnter the division table you want to test yourself on:\n");
	 divider = keyboard.nextInt();
	 return divider;
	}
	
	public double getCorrect() {
	 double answer;
	 double count = 0;
	 
	 Scanner keyboard = new Scanner(System.in);
	 while(count <= 12) {
	 System.out.println("\nWhat is " + count + " divided by " + divider + 
	 "(you must answer using 18 decimal places if the answer is not exact)?\n");
	 answer = keyboard.nextDouble();
	 
		 if(answer == count/divider) {
		 System.out.println("\nCorrect!");
		 count++;
		 correct++;
		 }
		 else {
		 System.out.println("\nIncorrect!");
		 }
	 }
	 return correct;
	}
	
	public void display() {
	 System.out.println("\nYou got " + correct + " correct\n");
	}	
}
