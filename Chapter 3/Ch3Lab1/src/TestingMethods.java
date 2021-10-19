/*
 Program: TestingMethods.java
 Programmer: Codie Sharp
 Purpose: To test the charAt() method, substring(), trim(), indexOf(),
 toUpperCase(), toLowerCase(), length(), equalsIgnoreCase(),lastIndexOf()
 */
public class TestingMethods {

	public static void main(String[] args) {
String message, message2, message3;



message="A long time ago, in a galaxy far, far, away";

//testing the length() method
System.out.println(message.length());

//testing the equalsIgnoreCase() method
System.out.println(message.equalsIgnoreCase("A long time ago"));

//testing the toLowerCase() method
System.out.println(message.toLowerCase());

//testing the toUpperCase() method
System.out.println(message.toUpperCase());



message2="      A long time ago, in a galaxy far, far, away        ";

//testing the trim() method
System.out.println(message2.trim());

//testing the charAt() method
System.out.println(message2.charAt(10));
System.out.println(message2.charAt(20));

//testing the substring() method
System.out.println(message2.substring(10));
System.out.println(message2.substring(25));

//testing the substring(Start, End) method
System.out.println(message2.substring(10,25));
System.out.println(message2.substring(5,30));

//testing the indexOf() method
System.out.println(message2.indexOf("far"));
System.out.println(message2.indexOf("Codie"));

//testing the indexOf(A_String, Star) method
System.out.println(message2.indexOf("galaxy",10));
System.out.println(message2.indexOf("Codie",2));

//testing the lastIndexOf() method
System.out.println(message2.lastIndexOf("far"));
System.out.println(message2.lastIndexOf("Codie"));



message3=message;

//testing the compareTo() method
System.out.println(message3.compareTo("far"));
System.out.println(message3.compareTo(message2));
System.out.println(message3.compareTo(message));

String entry = "adventure";
System.out.println(entry.compareTo("zoo"));

	}

}