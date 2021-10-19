/* 	Codie Sharp
 * 	12/2/20
 *	Develop a class that contains basic attributes for all show horses*/

public class DraftHorse extends Horse {
	// additional attributes beyond those inherited from Horse
	private String classification, draftBreed;
	
	public DraftHorse()
	{
	}
	
	public DraftHorse(int anIdNo, String aCoatColor,int anAge,double aHeight,String
	aClassification,String aDraftBreed)
	{
		// invoke super class constructor
		super(anIdNo, aCoatColor, anAge, aHeight);
		// set subclass attribute values
		setClassification(aClassification);
		setDraftBreed(aDraftBreed);
	}
	
	// set accessor methods
	public void setClassification(String aClassification)
	{
		classification=aClassification;
	}
	public void setDraftBreed(String aDraftBreed)
	{
		draftBreed = aDraftBreed;
	}
	// get accessor methods
	public String getClassification()
	{
		return classification;
	}
	public String getDraftBreed()
	{
		return draftBreed;
	}
	public String tellAboutHorse()
	{
		// returns values of attributes as one string
		String horseDetails;
		horseDetails = String.format("%s%n%n%s%n%s%n%n%s%n%s", super.tellAboutHorse(), 
		"Classification: ", classification, "Draft Breed: ", draftBreed);
		return horseDetails;
	}
	
}
