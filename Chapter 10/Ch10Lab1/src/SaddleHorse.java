/* 	Codie Sharp
 * 	12/2/20
 *	Develop a class that contains basic attributes for all show horses*/

public class SaddleHorse extends Horse {
	private String saddleType;
	private String saddleBreed;
	
	public SaddleHorse()
	{
	}
	// constructor
	public SaddleHorse(int anIdNo, String aCoatColor,int anAge,double aHeight,String
	aSaddleType,String aSaddleBreed)
	{
		super(anIdNo,aCoatColor,anAge,aHeight);
		setSaddleType(aSaddleType);
		setSaddleBreed(aSaddleBreed);
	}
	// set accessor methods
	public void setSaddleType(String aSaddleType)
	{
		saddleType=aSaddleType;
	}
	public void setSaddleBreed(String aSaddleBreed)
	{
		saddleBreed = aSaddleBreed;
	}
	// get accessor methods
	public String getSaddleType()
	{
		return saddleType;
	}
	public String getSaddleBreed()
	{
		return saddleBreed;
	}
	public String tellAboutHorse()
	{
		// returns values of attributes as one string
		String horseDetails;
		horseDetails = String.format("%s%n%n%s%n%s%n%n%s%n%s", super.tellAboutHorse(), 
		"Saddle Type: ", saddleType, "Saddle Breed: ", saddleBreed);
		return horseDetails;
	}

}
