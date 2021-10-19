/**
In this program we will again create a user defined class, and then call a demo program to test it.
This lab will create a MathTest, user defined class, for several methods to be used for math
functions. Then we will create a demo program to test it.
 */

/**
 * @author codie
 * 10/28/20
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MathTest {
	private static int x = 1;
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void getPI() {
	 double answer, number = 10;
	 answer = Double.parseDouble(JOptionPane.showInputDialog(null, "What is " +number + " * " +Math.PI));
	 if(answer == Math.PI*number)
	 JOptionPane.showMessageDialog(null, "You are correct!");
	 else
	 JOptionPane.showMessageDialog(null, "Sorry but " + (Math.PI*number) + " is the correct answer");
	}

	public static void getMinimum() {
	 int answer, number1 = -10, number2 = -2;
	 answer = Integer.parseInt(JOptionPane.showInputDialog(null, "What number is smaller? " 
	 + number1 + " or " + number2 + "\nType in your choice"));
	 if(answer == Math.min(number1,number2))
	 JOptionPane.showMessageDialog(null, "You are correct!");
	 else
	 JOptionPane.showMessageDialog(null, "Sorry but" + Math.min(number1,number2) + " is the correct answer");
	}
	
	public static void getMaximum() {
	 int answer, number1 = -4, number2 = -15;
	 answer = Integer.parseInt(JOptionPane.showInputDialog(null, "What number is greater? " 
	 + number1 + " or " + number2 + "\nType in your choice"));
	 if(answer == Math.max(number1,number2))
	 JOptionPane.showMessageDialog(null, "You are correct!");
	 else
	 JOptionPane.showMessageDialog(null, "Sorry but" + Math.max(number1,number2) + " is larger than " + number2);
	}

	public static void getCeil() {
	 double number=2.62;
	 int answer;
	 answer =Integer.parseInt(JOptionPane.showInputDialog(null,"What is smallest integer greater than " + number + "?"));
	 if(answer == Math.ceil(number))
	 JOptionPane.showMessageDialog(null, "You are correct!");
	 else
	 JOptionPane.showMessageDialog(null, "Sorry but "+ Math.ceil(number) + " is the correct answer");
	}

	public static void getFloor() {
	 double number=2.62;
	 int answer;
	 answer =Integer.parseInt(JOptionPane.showInputDialog(null,"What is largest integer less than " + number + "?"));
	 if(answer == Math.floor(number))
	 JOptionPane.showMessageDialog(null, "You are correct!");
	 else
	 JOptionPane.showMessageDialog(null, "Sorry but "+ Math.floor(number) + " is the correct answer");
	}
	
	public static void getPowerValue() {
	 int number1=0,number2=1;
	 double answer;
	 for(int i = number1; i <=5;i++) {
	 answer = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the value of n to the " 
	 + number1 + " to the " + number2 + " power?"));
	 if(answer == Math.pow(number1,number2))
	 JOptionPane.showMessageDialog(null, "You are correct!");
	 else
	 JOptionPane.showMessageDialog(null, "Sorry but" + Math.pow(number1,number2) + " is the correct answer");
	 number1++;
	 number2++;
	 }
	}
	
	public static void getAbsoluteValue() {
	 double absoluteValue, answer;
	 for(int i=0; i <= 10; i++) {
	 answer = (2*(2*x -2) -3);
	 absoluteValue = Double.parseDouble(JOptionPane.showInputDialog(
	 "What is the absolute value of (2(2x - 2) - 3 if given x = " + x));
	 if(absoluteValue == Math.abs(answer))
	 JOptionPane.showMessageDialog(null,"You are correct");
	 else
	 JOptionPane.showMessageDialog(null,"Sorry! The absolute value of " + answer + " is " + Math.abs(answer));
	 x++;
	 }
	}
	
	public static void getRoundValue() {
	 double numerator=4, denominator=2,answer;
	 for(int i =0; i <= 12; i++) {
	 answer = Double.parseDouble(JOptionPane.showInputDialog(null,"Round off " + numerator + "/" + denominator));
		 if(answer == Math.round(numerator/denominator)) {
		 JOptionPane.showMessageDialog(null,"You are correct!");
		 }
		 else
		 JOptionPane.showMessageDialog(null,"Sorry, but " + numerator + "/"
		 + denominator + " rounds off to " + Math.round(numerator/denominator));
		 numerator++;
		 denominator++;
	 }
	}
	
	public static void getSquareRoot() {
	 double number = .235, answer;
	 for(int i=1; i<=20;i++) {
	 answer = Double.parseDouble(JOptionPane.showInputDialog("What is the square root of " 
	 + number + " rounded to the nearest whole number?"));
		 if(answer == Math.round(Math.sqrt(number))) {
		 JOptionPane.showMessageDialog(null,"You are correct!");
		 }
		 else
		 JOptionPane.showMessageDialog(null,"Sorry but the square root of "
		 + number + " is " + (Math.round(Math.sqrt(number))));
		 number = number +3.6325;
	 }
	}
}
