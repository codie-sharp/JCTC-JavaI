/**
In this program we will again work with user defined classes. We will work with constructor
methods and creating instances of the user defined class within a demo program. This program
will deal with banking accounts.

 */

/**
 * @author codie
 * 10/27/20 
 */

public class BankDemo {

	/**
	 * Create Bank objects and test the methods in the Bank class.
	 */
	
	public static void main(String[] args) {
		
		Bank bank1 = new Bank();
		bank1.readCheckingInfo();
		
		Bank bank2 = new Bank("AB123","Vicky Hardin", 1000.00, 500.00);
		bank2.writeCheckingInfo();
		if ( bank1.equals( bank2 ) )
		System.out.println( "The two bank accounts are identical" );
		else
		System.out.println( "The two bank accounts are different" );
		Bank bank3 = new Bank("AB123", "Vicky Hardin", "Microsoft", 5,25.00);
		bank3.writeStockInfo();
		
		Bank bank4 = new Bank();
		bank4.readStockInfo();
	}

}
