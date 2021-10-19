/*	Codie Sharp
 * 	12/3/20
 *	Abstract methods*/

public class Ch10Lab2 {

	public static void main(String[] args) {
		Horse horse = new Horse("American Pharoah", "Thoroughbred");
		Dinosaur dino = new Dinosaur("Rex", "Tyrannosaurus Rex");
		
		System.out.println("For the horse: ");
		System.out.print("This is: "); horse.describe();
		System.out.print("Sound: "); horse.sound();
		System.out.print("Sleeping: "); horse.sleep();
		System.out.print("Moving: "); horse.move();
		System.out.println("\n");
		
		System.out.println("For the dinosaur: ");
		System.out.print("This is: "); dino.describe();
		System.out.print("Sound: "); dino.sound();
		System.out.print("Sleeping: "); dino.sleep();
		System.out.print("Moving: "); dino.move();
		System.out.println("\n");

	}

}
