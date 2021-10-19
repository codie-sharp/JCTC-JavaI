/*
Write a class encapsulating the concept of the weather
forecast, assuming that it has the following attributes: the
temperature and the sky conditions, which could be
sunny, snowy, cloudy, or rainy. Include a constructor, the
accessors and mutators, and methods toString and
equals. Temperature, in Fahrenheit, should be between –
50 and +150; the default value is 70, if needed. The
default sky condition is sunny. Include a method that
converts Fahrenheit to Celsius. Celsius temperature =
(Fahrenheit temperature – 32) * 5 / 9. Also include a
method that checks whether the weather attributes are
consistent (there are two cases where they are not
consistent: when the temperature is above 32 and it is
snowy, and when the temperature is below 32 and it is
rainy). Write a client class to test all the methods in your
class.
 */

public class Client {
	
	public static void main(String[] args) {
		//set objects
		Weather a = new Weather(23, "rainy");
		Weather b = new Weather(70, "cloudy");
		
		//display first block of text
		System.out.println("Temperature cannot be less than -50 or greater than 150."
		+ "\nTemperature set to 70.0."
		+ "\nThe temperature of weather forecast #1 is " + a.getTempF() +"F or " + a.getTempC() 
		+ "C\nThe sky condition of weather forecast #1 is " + a.getSky()
		+ "\nWeather forecast #2 is " + b);
		 
		//check object a for consistency
		if ((a.getTempF() > 32 && a.getSky() == "snowy") || (a.getTempF() < 32 && a.getSky() == "rainy"))
			System.out.println("\nweather forecast" + a + " is not consistent");
		else
			System.out.println("\nweather forecast" + a + " is consistent");
		 
		//check object b for consistency
		if ((b.getTempF() > 32 && b.getSky() == "snowy") || (b.getTempF() < 32 && b.getSky() == "rainy"))
			System.out.println("weather forecast " + b + " is not consistent\n");
		else
			System.out.println("weather forecast " + b + " is consistent\n");
		
		//print out comparison and modify
		boolean x = true; 
		while (x) {
			if(a.equals(b)) {
		    	System.out.println("Original weather forecast #1 and modified weather forecast #2 are identical");			    	x = !x;
			    }
			else {
		    	System.out.println("Original weather forecasts #1 and #2 are different");
		    	a = b;
			    }
		}
	}
} 