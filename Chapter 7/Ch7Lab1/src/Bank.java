/**
In this program we will again work with user defined classes. We will work with constructor
methods and creating instances of the user defined class within a demo program. This program
will deal with banking accounts.
 */

/**
 * @author codie
 * 10/26/20
 */
import java.util.Scanner;
import java.text.NumberFormat;


public class Bank {
	private String accountNumber, accountName, stockName;
	private double checkingDeposit, checkingWithdrawal, totalChecking, stockValue, totalStockValue;
	private int stockShares;
	private NumberFormat currency = NumberFormat.getCurrencyInstance();
	
	public Bank(String newAccountNumber, String newAccountName, double
			newCheckingDeposit, double newCheckingWithdrawal)
			{
			 accountNumber = newAccountNumber;
			 accountName = newAccountName;
			 checkingDeposit = newCheckingDeposit;
			 checkingWithdrawal = newCheckingWithdrawal;
			}

	public Bank(String newAccountNumber, String newAccountName, String
			newStockName, int newStockShares,double newStockValue)
			{
			 accountNumber = newAccountNumber;
			 accountName = newAccountName;
			 stockName = newStockName;
			 stockShares = newStockShares;
			 stockValue = newStockValue;
			}

	public Bank()
	{
	}

	public String getAccountNumber()
	{
	 return accountNumber;
	}
	public String getAccountName()
	{
	 return accountName;
	}
	public String getStockName()
	{
	 return stockName;
	}
	public double getCheckingDeposit()
	{
	 return checkingDeposit;
	}
	public double getCheckingWithdrawal()
	{
	 return checkingWithdrawal;
	}
	public double getStockValue()
	{
	 return stockValue;
	}
	public int getStockShares()
	{
	 return stockShares;
	}

	public void setAccountNumber(String newAccountNumber)
	{
	 accountNumber = newAccountNumber;
	}
	public void setAccountName(String newAccountName)
	{
	 accountName = newAccountName;
	}
	public void setStockName(String newStockName)
	{
	 stockName = newStockName;
	}
	public void setCheckingDeposit(double newCheckingDeposit)
	{
	 checkingDeposit = newCheckingDeposit;
	}
	public void setCheckingWithdrawal(double newCheckingWithdrawal)
	{
	 checkingWithdrawal = newCheckingWithdrawal;
	}
	public void setStockValue(double newStockValue)
	{
	 stockValue = newStockValue;
	}
	public void setStockShares(int newStockShares)
	{
	 stockShares = newStockShares;
	}

	public void writeCheckingInfo() {
	 totalChecking = checkingDeposit - checkingWithdrawal;
	 if(totalChecking < 0)
	 System.out.println("\nYou have overdrawn your checking account. A fee will be issued");
	 else
	 System.out.println("There is a balance of " + currency.format(totalChecking) +
			 "in account number " + accountNumber + " under the name of " + accountName +"\n");
	}
	
	public void writeStockInfo() {
	 totalStockValue = stockShares*stockValue;
	 System.out.println("\nAccount Number " + accountNumber + 
			 " under the name of "+accountName + " has purchased " + stockShares + " shares of " 
			 + stockName + "stock, for a total value of " + currency.format(totalStockValue) + "\n");
	}
	
	public void readCheckingInfo()
	{
	 char answer;
	 Scanner keyboard = new Scanner(System.in);
	 System.out.println("Please enter the account number ");
	 accountNumber = keyboard.nextLine();
	 System.out.println("Please enter the account name (first name/last name)");
	 accountName = keyboard.nextLine();
	 System.out.println("What are you depositing into your checking account today?");
	 checkingDeposit = keyboard.nextDouble();
	 System.out.println("Are you making any withdrawals? (Y/N)");
	 answer = keyboard.next().charAt(0);
	 
	 if((answer == 'Y') || (answer == 'y'))
	 {
		 System.out.println("Please enter the amount of the withdrawal");
		 checkingWithdrawal = keyboard.nextDouble();
	 }
	 else
		 checkingWithdrawal = 0;
		 writeCheckingInfo();
	 }
	
	public void readStockInfo() {
		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("Please enter the account number ");
		 accountNumber = keyboard.nextLine();
		 System.out.println("Please enter the account name (first name/last name)");
		 accountName = keyboard.nextLine();
		 System.out.println("What is the name of the stock you are purchasing shares in?");
		 stockName = keyboard.nextLine();
		 System.out.println("How many shares of "+stockName+ " have you purchased?");
		 stockShares = keyboard.nextInt();
		 System.out.println("What was the current per share cost of " + stockName + "?");
		 stockValue = keyboard.nextDouble();
		 writeStockInfo();
	}
	
	public boolean equals( Object o ) {
		 if ( ! ( o instanceof Bank ) )
		 return false;
		 else
		 {
		 Bank cg = (Bank) o;
		 return ( accountNumber.equals( cg.accountNumber )
		 && accountName == cg.accountName
		 && checkingDeposit == cg.checkingDeposit
		 && checkingWithdrawal == cg.checkingWithdrawal);
		 }
	}

}
