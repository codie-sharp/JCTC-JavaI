/*	Codie Sharp 12/6/20
Write a class encapsulating a trivia game, which inherits
from Game. A trivia game has the following additional
attributes: the ultimate money prize and the number of
questions that must be answered to win the ultimate
money. Code the constructor and the toString method of
the new class. You also need to include a client class to
test your code.*/

public class Game
{
	private String description;
	
	public Game( String description )
	{
		setDescription( description );
	}
	
	public String getDescription( )
	{
		return description;
	}
	
	public void setDescription( String description )
	{
		this.description = description;
	}
	
	public String toString( )
	{
		return "description: " + description ;
	}
}