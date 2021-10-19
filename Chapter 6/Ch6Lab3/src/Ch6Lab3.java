import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch6Lab3 {

	public static void main(String[] args) {
		//Declarations
		int numberOfGrades;
		double grade, totalGrades = 0, average;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many grades will you enter?");
		numberOfGrades = input.nextInt();
		
		for(int i = 1; i <= numberOfGrades; i++) {
		System.out.println("\nEnter grade " + i);
		grade = input.nextDouble();
		totalGrades = totalGrades + grade;
		}
		
		average = totalGrades / numberOfGrades;
		System.out.println("\n\nThe total grades are " + totalGrades + " and the average grade is " + average);

	}

}
