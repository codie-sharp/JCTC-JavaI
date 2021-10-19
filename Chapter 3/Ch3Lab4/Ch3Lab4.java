/*
 Course: CIT 149 Fall 2020
 Program: Ch3Lab4.java
 Programmer: Codie Sharp
 Purpose: This program will play a number guessing game. The user will
 enter a number between 1-100 and a random number will be
 generated within this range. The user's number and the random
 number will display.
*/

import java.util.Random;
import java.util.Scanner;

public class Ch3Lab4 {

	public static void main(String[] args) {
		Random number = new Random();
		Scanner keyboard = new Scanner(System.in);
		int MAXIMUM = 100;
		
		int randomNumber = number.nextInt(MAXIMUM);
		int yourNumber;
		
		System.out.println("Choose a random number between 1 and " + MAXIMUM);
		yourNumber = keyboard.nextInt();

		System.out.println("Your number was " + yourNumber + 
				"\nThe random number generated was " + randomNumber);

	}

}
