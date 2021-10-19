/**
In this lab we will use a user defined class that will hold all the methods that will either contain
the code requesting information from the user, or will simply receive information from the main
driver class, and display the information. The purpose is to create methods and attributes 
pertaining to all breeds of dogs.
 */

/**
 * @author codie
 * 10/30
 */
public class DogsDemo {

	public static void main(String[] args) {
		String dogName, dogBreed, dogClass;
		int numberOfRibbons, numberOfShows;
		
		Dogs dogsInfo = new Dogs();
		dogsInfo.readInput();
		dogsInfo.writeOutput();

		dogsInfo.setName("CD");
		dogsInfo.setClass("Working");
		dogsInfo.setBreed("Cairn Terrier");
		dogsInfo.setNumberRibbons(5);
		dogsInfo.setNumberOfShows(8);
		dogsInfo.writeOutput();
		
		dogsInfo.setName("Lassie");
		dogsInfo.setClass("Working");
		dogsInfo.setBreed("Collie");
		dogsInfo.setNumberRibbons(10);
		dogsInfo.setNumberOfShows(12);
		dogsInfo.writeOutput();
		
		dogsInfo.setName("Benji");
		dogsInfo.setClass("Mutt");
		dogsInfo.setBreed("Mutt");
		dogsInfo.setNumberRibbons(0);
		dogsInfo.setNumberOfShows(1);
		dogsInfo.writeOutput();
	}

}
