import java.util.Scanner;

public class Ch5PA2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String conv1 = "", conv2 = "", conv3 = "";
		
		//Get input and convert to words.
		System.out.println("Enter the first operand > ");
		int int1 = keyboard.nextInt();
		switch(int1)
		{
			case 1: conv1 = "one";
				break;
			case 2: conv1 = "two";
				break;
			case 3: conv1 = "three";
				break;
			case 4: conv1 = "four";
				break;
			case 5: conv1 = "five";
				break;
			case 6: conv1 = "six";
				break;
			case 7: conv1 = "seven";
				break;
			case 8: conv1 = "eight";
				break;
			case 9: conv1 = "nine";
				break;
			case 0: conv1 = "zero";
				break;
			default:
				System.out.println("Invalid number.");
				return;
		}
		
		System.out.println("Enter the second operand > ");
		int int2 = keyboard.nextInt();
		switch(int2)
		{
			case 1: conv2 = "one";
				break;
			case 2: conv2 = "two";
				break;
			case 3: conv2 = "three";
				break;
			case 4: conv2 = "four";
				break;
			case 5: conv2 = "five";
				break;
			case 6: conv2 = "six";
				break;
			case 7: conv2 = "seven";
				break;
			case 8: conv2 = "eight";
				break;
			case 9: conv2 = "nine";
				break;
			case 0: conv2 = "zero";
				break;
			default: System.out.println("Invalid number.");
				return;
		}
		
		//Convert operator, math, and output.
		System.out.println("Enter the operator > ");
		char opr = keyboard.next().charAt(0);
		switch(opr)
		{
			case '+': conv3 = " plus ";
				System.out.println(conv1 +conv3 +conv2 +" is " +(int1 + int2));
				break;
			case '-': conv3 = " minus ";
				System.out.println(conv1 +conv3 +conv2 +" is " +(int1 - int2));
				break;
			case '*': conv3 = " multiplied by ";
				System.out.println(conv1 +conv3 +conv2 +" is " +(int1 * int2));
				break;
			case '/': conv3 = " divided by ";
				if(int2 != 0)
				System.out.println(conv1 +conv3 +conv2 +" is " +(int1/int2));
				else
				System.out.println("Division by zero is not allowed.");
				break;
			case '^': conv3 = " to the power of ";
				System.out.println(conv1 +conv3 +conv2 +" is " +Math.pow(int1,int2));
				break;
			default: System.out.println("Invalid operator.");
				return;
		}
		
	}

}
