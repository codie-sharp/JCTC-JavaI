/*
 Course: CIT 149 Fall 2020
 Program: Ch3PA1.java
 Programmer: Codie Sharp
 Purpose: To take user input of an email address and break it 
 into username and domain. 
 */

import java.util.Scanner; //import scanner to get user input

public class Ch3PA1 {

	public static void main(String[] args) {
		
		//Get email
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an email address");
		String email = input.nextLine();
		
		//Find the @ symbol and break apart email
		int at = email.indexOf('@');
		String user = email.substring(0, at);
		String domain = email.substring(at + 1);
		
		System.out.println("The username of the email address of "
				+email+" is "+user+"\nThe domain name is "+domain);
	}

}
