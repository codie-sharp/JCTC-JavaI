/*	Codie Sharp
 * 	12/3/20
 *	Abstract methods*/

public class Horse extends Animal {
	private String name; // Name of a Horse!
	private String breed; // Horse breed
	
	public Horse(String aName)
	{
		super("Horse"); // Call the base constructor
		name = aName; // Supplied name
		breed = "Unknown"; // Default breed value
	}

	public Horse(String aName, String aBreed)
	{
		super("Horse"); // Call the base constructor
		name = aName; // Supplied name
		breed = aBreed; // Supplied breed
	}

	@Override
	public void describe() {
		System.out.println(name + " the " + breed);
	}

	@Override
	public void sound() {
		System.out.println("Neigh Neigh");
	}

	@Override
	public void sleep() {
		System.out.println(name+" sleeps standing up!");
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
