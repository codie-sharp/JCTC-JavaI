/*
Using a loop, write a program that takes 10 values
representing exam grades (between 0 and 100) from the
keyboard and outputs the minimum value, maximum
value, and average value of all the values entered. Your
program should not accept values less than 0 or greater
than 100.
 */

import java.util.Scanner;

public class Ch6PA2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
//Max and min set to extreme valid inputs
		double grade, sum = 0, max = 0, min = 100;
		int i;
		
//Collect 10 grades between 0 and 100
//If grades entered are < 0 or > 100, reprompt without increasing counter
		for(i = 0; i < 10;) {
			do {
				System.out.println("Enter grade " +(i + 1) +" >");
				grade = sc.nextDouble();
				}
			while (grade < 0 || grade > 100);
					
//If grade entered is valid, increase counter and check for min and max
			i++;
			sum += grade;
			if (grade > max) {
				max = grade;
			}
			if (grade < min) {
				min = grade;
			}
		}

//Display results		
		System.out.println("The average grade is " +(sum/i)
				+",\n	the minimum grade is " +min
				+",\n	and the maximum grade is " +max);
	}
}
