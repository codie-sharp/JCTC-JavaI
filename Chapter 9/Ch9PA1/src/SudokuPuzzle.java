/* Chapter 9 Lab 1
 * Programmer: Codie Sharp
 * Date: 11/19/2020
 * Purpose: To practice the creation of multi-dimensional arrays
 */
public class SudokuPuzzle {
	private int board[][];
	private int start[][];
	private int SIZE = 25;
	private int GRID_SIZE = 5;

	public SudokuPuzzle()
	{
	 start = new int[SIZE][SIZE];
	 board = new int[SIZE][SIZE];
	}

	public String toString()
	{
		String puzzleString = "Row/Col\n      1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25\n";
		puzzleString = puzzleString +"     --------------------------------------------------------------------------\n";
		
		for(int i = 0; i < SIZE; i++) 
		{
			if(i < 9)
			{
				puzzleString = puzzleString +(i + 1) +"   |";
			}
			else
				puzzleString = puzzleString +(i + 1) +"  |";
			for(int j = 0; j < SIZE; j++)
			{
				if(board[i][j] == 0)
					puzzleString = puzzleString +" " +".|";
				else if(board[i][j] > 9)
					puzzleString = puzzleString +"" +board[i][j] +"|";
				else
					puzzleString = puzzleString +" " +board[i][j] +"|";
			}
			puzzleString = puzzleString +"\n";
			puzzleString = puzzleString +"    |__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
		}
		return puzzleString;
	}

	public void addInitial(int row, int col, int value)
	{
		if(row >= 0 && row <= SIZE && col >= 0 && col <= SIZE && value >= 1 && value <= SIZE)
		{
			start[row][col] = value;
			board[row][col] = value;
		}
	}
	
	public void addGuess(int row, int col, int value)
	{
		if(row >= 0 && row <= SIZE && col >= 0 && col <= SIZE && value >= 1 && value <= SIZE && start[row][col] == 0) 
		{
			board[row][col] = value;
		}
	}
	
	public int getValueIn(int row, int col)
	{
	 return board[row][col];
	}
	
	public void reset()
	{
	 for(int i = 0; i < SIZE; i++)
		 for(int j = 0; j < SIZE; j++)
			 board[i][j] = start[i][j];
	}

	
	public boolean isFull()
	{
		 boolean allFilled = true;
		 for(int i = 0; i< SIZE; i++)
		 for(int j = 0; j < SIZE; j++)
		 allFilled = allFilled && board[i][j] > 0;
		 return allFilled;
	}

	public boolean[] getAllowedValues(int row, int col)
	{
		 int savedValue = board[row][col];
		 boolean result[] = new boolean[SIZE];
		 for(int value = 1; value <= SIZE; value++)
		 {
			 board[row][col] = value;
			 result[value - 1] = checkPuzzle();
		 }
		 board[row][col] = savedValue;
		 return result;
	}
	
	public boolean checkPuzzle()
	{
		 boolean looksGood = true;
		 for(int i = 0; i < SIZE; i++)
		 {
			 looksGood = looksGood && checkRow(i);
			 looksGood = looksGood && checkCol(i);
			 looksGood = looksGood && checkSub(i);
		 }
		 return looksGood;
	}
	
	public boolean checkRow(int row)
	{
		 int count[] = new int[SIZE + 1];
	
		 for(int col = 0; col < SIZE; col++)
		 {
			 count[board[row][col]]++;
		 }
		 boolean countIsOk = true;
		 
		 for(int i = 1; i <= SIZE; i++)
			 countIsOk = countIsOk && (count[i]<=1);
		 return countIsOk;
	}

	public boolean checkCol(int col)
	{
		 int count[] = new int[SIZE + 1];
		 for(int row = 0; row < SIZE; row++)
		 {
			 count[board[row][col]]++;
		 }
		 boolean countIsOk = true;
		 for(int i = 1; i <= SIZE; i++)
			 countIsOk = countIsOk && (count[i]<=1);
		 return countIsOk;
	}
	
	public boolean checkSub(int sub)
	{
		 int count[] = new int[SIZE + 1];
		 int rowBase = (sub / GRID_SIZE) * GRID_SIZE;
		 int colBase = (sub % GRID_SIZE) * GRID_SIZE;
		 
		 for(int i = 0; i < GRID_SIZE; i++)
		 {
			 for(int j = 0; j < GRID_SIZE; j++)
			 {
				 count[board[rowBase+i][colBase+j]]++;
			 }
		 }
		 boolean countIsOk = true;
		 for(int i = 1; i <= SIZE; i++)
			 countIsOk = countIsOk && (count[i] <= 1);
		 return countIsOk;
	}

	public void initializePuzzle()
	{
		addInitial(0,0,16);
		addInitial(0,2,9);
		addInitial(0,4,1);
		addInitial(0,5,19);
		addInitial(0,6,24);
		addInitial(0,8,15);
		addInitial(0,16,8);
		addInitial(0,18,23);
		addInitial(0,23,11);
		
		addInitial(1,6,12);
		addInitial(1,7,9);
		addInitial(1,9,1);
		addInitial(1,10,19);
		addInitial(1,16,10);
		addInitial(1,19,13);

		addInitial(2,0,5);
		addInitial(2,1,2);
		addInitial(2,2,8);
		addInitial(2,5,7);
		addInitial(2,8,3);
		addInitial(2,18,15);

		addInitial(3,0,13);
		addInitial(3,6,2);
		addInitial(3,11,22);
		addInitial(3,15,16);
		addInitial(3,17,9);
		addInitial(3,18,17);
		addInitial(3,21,24);
		addInitial(3,24,6);

		addInitial(4,4,15);
		addInitial(4,5,13);
		addInitial(4,8,18);
		addInitial(4,11,2);
		addInitial(4,12,8);
		addInitial(4,13,25);
		addInitial(4,14,23);
		addInitial(4,17,21);
		addInitial(4,23,17);

		addInitial(5,2,12);
		addInitial(5,4,17);
		addInitial(5,6,19);
		addInitial(5,7,24);
		addInitial(5,9,15);
		addInitial(5,10,13);

		addInitial(6,1,7);
		addInitial(6,4,3);
		addInitial(6,7,12);
		addInitial(6,10,6);
		addInitial(6,13,4);
		addInitial(6,24,23);

		addInitial(7,0,23);
		addInitial(7,4,25);
		addInitial(7,9,3);
		addInitial(7,13,9);
		addInitial(7,16,19);
		addInitial(7,22,10);

		addInitial(8,1,13);
		addInitial(8,3,10);
		addInitial(8,4,18);
		addInitial(8,14,3);
		addInitial(8,18,9);
		addInitial(8,21,19);
		addInitial(8,22,24);
		addInitial(8,24,15);

		addInitial(9,1,6);
		addInitial(9,10,23);
		addInitial(9,11,5);
		addInitial(9,13,8);
		addInitial(9,19,3);
		addInitial(9,22,12);

		addInitial(10,7,19);
		addInitial(10,13,10);
		addInitial(10,16,5);
		addInitial(10,18,8);
		addInitial(10,23,21);
		addInitial(10,24,3);

		addInitial(11,1,11);
		addInitial(11,2,7);
		addInitial(11,6,1);
		addInitial(11,7,16);
		addInitial(11,11,6);
		addInitial(11,14,4);
		addInitial(11,15,14);
		addInitial(11,16,13);
		addInitial(11,21,5);

		addInitial(12,9,21);
		addInitial(12,13,12);
		addInitial(12,20,14);

		addInitial(13,0,18);
		addInitial(13,2,13);
		addInitial(13,4,10);
		addInitial(13,5,25);
		addInitial(13,7,5);
		addInitial(13,9,8);
		addInitial(13,12,7);
		addInitial(13,13,22);
		addInitial(13,16,1);
		addInitial(13,20,15);
		addInitial(13,21,6);

		addInitial(14,3,19);
		addInitial(14,5,18);
		addInitial(14,8,20);
		addInitial(14,19,21);
		addInitial(14,21,1);

		addInitial(15,2,1);
		addInitial(15,10,18);
		addInitial(15,13,20);
		addInitial(15,14,10);
		addInitial(15,15,25);
		addInitial(15,16,23);
		addInitial(15,18,2);
		addInitial(15,19,8);
		addInitial(15,20,3);

		addInitial(16,0,21);
		addInitial(16,3,7);
		addInitial(16,4,22);
		addInitial(16,6,17);
		addInitial(16,7,1);
		addInitial(16,11,15);
		addInitial(16,14,24);
		addInitial(16,20,25);
		addInitial(16,23,2);

		addInitial(17,1,25);
		addInitial(17,11,17);
		addInitial(17,13,16);
		addInitial(17,21,14);
		addInitial(17,23,20);

		addInitial(18,1,18);
		addInitial(18,2,14);
		addInitial(18,5,8);
		addInitial(18,10,21);
		addInitial(18,11,3);
		addInitial(18,15,9);
		addInitial(18,21,15);
		addInitial(18,23,19);
		addInitial(18,24,24);

		addInitial(19,0,24);
		addInitial(19,2,15);
		addInitial(19,5,10);
		addInitial(19,10,8);
		addInitial(19,16,3);
		addInitial(19,17,11);
		addInitial(19,20,9);
		addInitial(19,24,12);

		addInitial(20,1,9);
		addInitial(20,2,17);
		addInitial(20,10,10);
		addInitial(20,12,14);
		addInitial(20,14,20);
		addInitial(20,18,5);
		addInitial(20,19,2);
		addInitial(20,22,11);

		addInitial(21,1,21);
		addInitial(21,14,19);
		addInitial(21,17,14);
		addInitial(21,20,8);
		addInitial(21,21,25);

		addInitial(22,3,23);
		addInitial(22,4,5);
		addInitial(22,8,11);
		addInitial(22,11,9);
		addInitial(22,14,16);
		addInitial(22,18,6);

		addInitial(23,3,14);
		addInitial(23,5,2);
		addInitial(23,8,23);
		addInitial(23,12,3);
		addInitial(23,15,12);
		addInitial(23,18,1);
		addInitial(23,19,16);
		addInitial(23,22,15);

		addInitial(24,1,24);
		addInitial(24,3,15);
		addInitial(24,12,25);
		addInitial(24,13,23);
		addInitial(24,16,21);

	}












	
	
	
	
	
	
	
}
