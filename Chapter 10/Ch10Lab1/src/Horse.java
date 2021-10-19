/* 	Codie Sharp
 * 	12/2/20
 *	Develop a class that contains basic attributes for all show horses*/

public class Horse {
	//Declarations
	private int idNo, age;
	private String coatColor;
	private double height;
	
	//constructor methods
	public Horse() 
	{
	}
	
	//overloaded constructor
	public Horse(int anIdNo, String aCoatColor, int anAge, double aHeight)
	{
		setIdNo(anIdNo);
		setCoatColor(aCoatColor);
		setAge(anAge);
		setHeight(aHeight);
	}
	
	//set accessor methods with simple validation
	public void setIdNo(int anIdNo)
	{
		idNo = anIdNo;
	}
	public void setCoatColor(String aCoatColor)
	{
		coatColor=aCoatColor;
	}
	public void setAge(int anAge)
	{
		age = anAge;
	}
	public void setHeight(double aHeight)
	{
		height = aHeight;
	}

	// get accessor methods
	public int getIdNo()
	{
		return idNo;
	}
	public String getCoatColor()
	{
		return coatColor;
	}
	public int getAge()
	{
		return age;
	}
	public double getHeight()
	{
		return height;
	}

	// custom method
	public String tellAboutHorse()
	{
		// returns values of attributes as one string
		String horseDetails;
		horseDetails = String.format("%n%n%s%n%d%n%n%s%n%s%n%n%s%n%d%n%n%s%n%.1f%s", "ID number: ", 
		idNo, "Coat Color: ", coatColor, "Age: ", age, "Height: ", height, " hands ");
		return horseDetails;
	}

}
