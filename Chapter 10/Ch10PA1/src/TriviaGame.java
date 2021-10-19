/*	Codie Sharp 12/6/20
Write a class encapsulating a trivia game, which inherits
from Game. A trivia game has the following additional
attributes: the ultimate money prize and the number of
questions that must be answered to win the ultimate
money. Code the constructor and the toString method of
the new class. You also need to include a client class to
test your code.*/

public class TriviaGame extends Game
{	
	private String prize;
	private int questions;
	
	public TriviaGame(String description, String prize, int questions)
	{
		super(description);
		setDescription(description);
		setPrize(prize);
		setQuestions(questions);
	}
	
	public String getPrize()
	{
		return prize;
	}
	
	public void setPrize(String prize)
	{
		this.prize = prize;
	}
	
	public int getQuestions()
	{
		return questions;
	}
	
	public void setQuestions(int questions)
	{
		this.questions = questions;
	}
	
	public String toString( )
	{
		return super.toString()
		+"\nPrize money: " +prize +"; Number of questions to answer: " +questions;
	}
}
