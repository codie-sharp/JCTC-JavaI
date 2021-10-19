/*	Codie Sharp
 * 	12/3/20
 *	Abstract methods*/

public class Dinosaur extends Animal {
	private String name; // Name of a Dinosaur!
	private String breed; // Dinosaur breed
	
	public Dinosaur(String aName)
	{
		super("Dinosaur"); // Call the base constructor
		name = aName; // Supplied name
		breed = "Unknown"; // Default breed value
	}
	
	public Dinosaur(String aName, String aBreed)
	{
		super("Dinosaur"); // Call the base constructor
		name = aName; // Supplied name
		breed = aBreed; // Supplied breed
	}
	
	@Override
	public void describe() {
		System.out.println(name + " the " + breed);
	}

	@Override
	public void sound() {
		System.out.println("Roar Roar");
	}

	@Override
	public void sleep() {
		System.out.println(name+" sleeps wherever he wants!");
	}

	@Override
	public void move() {
		System.out.println("Moves very fast!");
	}
	
	public String getName()
	{
		return name;
	}
}
