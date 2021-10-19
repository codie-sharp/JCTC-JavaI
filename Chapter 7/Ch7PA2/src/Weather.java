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

public class Weather {
	private double tempF, tempC;
	private String sky;
	
		public Weather(double tempF, String sky) {
			this.tempF = tempF;
			this.tempC = (tempF - 32) * 5/9;
			this.sky = sky;
		}
		
		//Accessors
		public double getTempF() {
			return tempF;
		}
		
		public double getTempC() {
			return tempC;
		}
		
		public String getSky() {
			return sky;
		}
		
		//Mutators
		public void setTempF(double newTempF) {
			tempF = newTempF;
		}
		
		public void setSky(String newSky) {
			sky = newSky;
		}
		
		//Overriding the toString and adding text
		public String toString() {
			return "temperature: " +tempF +"; sky: " +sky;
		
		}
	
}
