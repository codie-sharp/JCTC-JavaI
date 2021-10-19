/*
 * 10/2/20
 * Codie Sharp
 * Purpose: Change fahrenheit to celsius and vice versa.
 */
import java.util.Scanner;

public class Ch5Lab3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double degrees, converted;
		String scale; 
		
		System.out.println();
		System.out.println();
		System.out.println("Enter a temperature in degrees (for example 29.6): ");
		degrees = keyboard.nextDouble();
		System.out.println();
		System.out.println("Enter 'f' for Fahrenheit or 'c' for Celsius: ");
		scale = keyboard.next();
		System.out.println();
		
		if(scale.equalsIgnoreCase("f"))
		{
		converted = 5 * (degrees - 32) /9;
		System.out.println(degrees + " degrees F = " + converted + " degrees Celsius.");
		}
		else if(scale.equalsIgnoreCase("c"))
		{
		converted = degrees * 9/5 + 32;
		System.out.println(degrees + " degrees C = " + converted + " degrees Fahrenheit.");
		}
		else
		{
		System.out.println("You have entered an incorrect scale. This program will now end");
		System.exit(0);
		}

	}

}
