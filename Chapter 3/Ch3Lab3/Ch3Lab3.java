/*
 Course: CIT 149 Fall 2020
 Program: Ch3Lab3.java
 Programmer: Codie Sharp
 Purpose: This program will have the user input meal costs, coupon
 discount and payment denomination. It will then calculate the
 amount of change.
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ch3Lab3 {

	public static void main(String[] args) {
		double meal, drink, dessert, coupon, total, denomination, centChange;
		int dollarChange;
		
		DecimalFormat decimal = new DecimalFormat(".00");
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		DecimalFormat currency2 = new DecimalFormat("$##,##0");
		
		meal = Double.parseDouble(JOptionPane.showInputDialog(
				"What was the total cost of your meal?"));
		drink = Double.parseDouble(JOptionPane.showInputDialog(
				"What was the price of your beverage?"));
		dessert = Double.parseDouble(JOptionPane.showInputDialog(
				"What was the price of your dessert?"));
		coupon = Double.parseDouble(JOptionPane.showInputDialog(
				"Do you have any coupons? Enter 0 for none or the amount of the coupon"));

		total = (meal + drink + dessert) - coupon;
		
		JOptionPane.showMessageDialog(null, "Your meal was " +
				currency.format(meal )+"\n" +
				"The cost of your drink was "
				+ currency.format(drink) + "\n" +
				"The cost of your dessert was "
				+ currency.format(dessert) + "\n" +
				"Coupon deduction is " 
				+ currency.format(coupon) + "\n" +
				"The total cost of your meal is " 
				+ currency.format(total));
		
		denomination = Double.parseDouble(JOptionPane.showInputDialog(
				"What is the denomiation of the bill you will be paying with today?"));

		dollarChange = (int)(denomination-total);
		centChange = (denomination-total) - dollarChange;
				
		JOptionPane.showMessageDialog(null, "Your change is " +
				currency2.format(dollarChange )+ " dollars and " +
				decimal.format(centChange) + " cents\n");
	}

}
