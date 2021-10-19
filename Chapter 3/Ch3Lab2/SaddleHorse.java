
public class SaddleHorse {
	
private int idNo, age;
private String coatColor, saddleType, saddleBreed;
private double height;

public SaddleHorse()
{
}

public SaddleHorse(int aIdNo, String aCoatColor, int aAge, double aHeight, String aSaddleType, String aSaddleBreed)
{
	idNo=aIdNo;
	coatColor=aCoatColor;
	age=aAge;
	height=aHeight;
	saddleType=aSaddleType;
	saddleBreed=aSaddleBreed;
}

//get accessor methods
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
public String getSaddleType()
{
	return saddleType;
}
public String getSaddleBreed()
{
	return saddleBreed;
}

//set mutator methods
public void setIdNo(int anIdNo)
{
	idNo=anIdNo;
}
public void setCoatColor(String aCoatColor)
{
	coatColor=aCoatColor;
}
public void setAge(int anAge)
{
	age=anAge;
}
public void setHeight(double aHeight)
{
	height=aHeight;
}
public void setSaddleType(String aSaddleType)
{
	saddleType=aSaddleType;
}
public void setSaddleBreed(String aSaddleBreed)
{
	saddleBreed=aSaddleBreed;
}


public String tellAboutHorse()
{
	//returns values of attributes as one string
	String horseDetails;
	
	horseDetails="ID number:\t"+idNo
			+ "\nCoat Color:\t"+coatColor
			+ "\nAge:\t\t"+age
			+ "\nHeight:\t\t"+height+" hands"
			+ "\nSaddle Type:\t"+saddleType
			+ "\nSaddle Breed:\t"+saddleBreed;
	return horseDetails;
}

}


