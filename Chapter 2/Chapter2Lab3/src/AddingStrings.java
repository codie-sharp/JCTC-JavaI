/*
 * 	Program: AddingStrings.java
 * 	Programmer: Codie Sharp
 * 	Purpose: Accept user input and add two strings together.
 */
import java.util.Scanner;
public class AddingStrings {

	public static void main(String[] args) {
		// Strings to store input
		String first, last, fullName, major;
		Scanner keyboard= new Scanner(System.in);
		
		// Initial text
		System.out.println();
		System.out.println("I will add two strings into one statement");
		System.out.println();
		
		// String first
		System.out.println("Enter your first name");
		first= keyboard.nextLine();
		
		//String last
		System.out.println();
		System.out.println("Enter your last name and hit Enter");
		last= keyboard.nextLine();
		
		System.out.println();
		
		//String major
		System.out.println("What is your major?");
		major=keyboard.nextLine();
		
		//Concatenate
		fullName= first+" "+last;
		
		//Display Value
		System.out.println();
		System.out.println("Full Name:"+fullName);
		System.out.println();
		
		System.out.println("Major is: "+major+"\n");
	}

}
