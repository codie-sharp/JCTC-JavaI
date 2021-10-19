/**
 *  test the methods in the Temperature class
 */

/**
 * @author codie
 * 11/3
 */
import java.util.Scanner;

public class Ch8Lab3 {
	public static void main(String[] args) {
		int[] temperatures1 = new int[3];
		int[] temperatures2;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nEnter this week's temperatures\n");
		for(int i = 0; i < temperatures1.length; i++) {
		temperatures1[i] = keyboard.nextInt();
		}
		Temperature temps1 = new Temperature(temperatures1);
		System.out.println("\ntemps1:\n" + temps1 + "\n");
		
		System.out.println("\nThe highest temperature for temps1 between any two consecutive days is: " 
		+ temps1.largestChange() + " degrees\n");
		
		System.out.println("\nTemperatures entered below 33 degrees for temps1: " 
		+temps1.belowFreezing() + "\n");
		
		if(temps1.getCountAbove() > 0) {
			int[] above100 = temps1.temperaturesAbove100();
			System.out.println("Temperatures above 100 for temps1 are : \n");
			for(int i = 0; i < above100.length; i++) {
				System.out.print(above100[i] + " ");
				System.out.println();
			}
		}
		
		temps1.sortArray();
		System.out.println("\nSorted temperatures for temps1 are\n" + temps1 + "\n");

		Temperature temps2 = new Temperature();
		temperatures2 = temps2.getTestTemperatures();
		System.out.println("\ntemps2:\n" + temps2 + "\n");
		System.out.println("\nThe highest temperature for temps2 between any two consecutive days is: " 
		+ temps2.largestChange() + " degrees\n");
		System.out.println("\nTemperatures entered below 33 degrees for temps2: " 
		+temps2.belowFreezing() + "\n");
		
		if(temps2.getCountAbove() > 0) {
			int[] above100Temps2 = temps2.temperaturesAbove100();
			System.out.println("Temperatures above 100 for temps1 are : \n");
			for(int i = 0; i < above100Temps2.length; i++) {
				System.out.print(above100Temps2[i] + " ");
				System.out.println();
			}
		}
		else
		System.out.println("There are no temperatures above 100");
		
		temps2.sortArray();
		System.out.println("\nSorted temperatures for temps2 are\n" + temps2 + "\n");
		
		System.out.println("\nTesting to see if the two objects are equals");
		if(temps1.equals( temps2))
		System.out.println("\nObjects are equal\n");
		else
		System.out.println("\nObjects are not equal\n");
		System.out.println("\nSetting temps1 and temps2 arrays to entered temperatures\n");
		temps2 = temps1;
		System.out.println("temps1:\n" + temps1);
		System.out.println("temps2:\n" + temps2);
		System.out.println("\nTesting to see if the two objects are equals\n");
		if(temps1.equals( temps2))
		System.out.println("\nObjects are equal\n");
		else
		System.out.println("\nObjects are not equal\n");
	}
}
