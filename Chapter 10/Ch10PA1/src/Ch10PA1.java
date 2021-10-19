/*	Codie Sharp 12/6/20
Write a class encapsulating a trivia game, which inherits
from Game. A trivia game has the following additional
attributes: the ultimate money prize and the number of
questions that must be answered to win the ultimate
money. Code the constructor and the toString method of
the new class. You also need to include a client class to
test your code.*/

public class Ch10PA1 
{
	public static void main(String[] args) 
	{
		TriviaGame tg1 = new TriviaGame("Thousandaire", "$1,000.00", 10);
		TriviaGame tg2 = new TriviaGame("Geo Party", "$24,901.00", 50);
		
		System.out.println(tg1);
		System.out.println(tg2);
		
		boolean equal = false;
		while(!equal)
		{
			if(tg1 != tg2)
			{
				System.out.println("tg1 and tg2 are not equal");
				tg1 = tg2;
			}
			else if (tg1 == tg2) 
			{
				System.out.println("tg1 and tg2 are now equal");
				equal = true;
			}
		}
	}
}
