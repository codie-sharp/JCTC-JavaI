import java.util.Scanner;

public class Ch6PA1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		do {
			System.out.println("Enter a number greater than 10 > ");
			num = sc.nextDouble();
			}
		while(num <= 10);
		
		int i; 
		for(i = 0; num >= 1.01; i++) {
			num = Math.sqrt(num);
			System.out.println(num);
		}
		
		System.out.println("The number of square roots is " +i);
	}
}
