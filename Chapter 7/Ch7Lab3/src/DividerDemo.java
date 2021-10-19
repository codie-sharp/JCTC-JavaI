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

public class DividerDemo {
	static int divider;
	static double correct;
	
	public static void main(String[] args) {
		Divider test = new Divider();
		test.welcome();
		divider = test.getDivider();
		correct = test.getCorrect();
		test.display();
	}
}
