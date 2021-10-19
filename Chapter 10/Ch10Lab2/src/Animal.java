
public abstract class Animal {
	String type;
	
	public Animal(String type)
	{
		this.type = new String(type);
	}
	
	public abstract void describe(); // Abstract method
	public abstract void sound(); // Abstract method
	public abstract void sleep(); // Abstract method
	public abstract void move(); // Abstract method

}
