/* Chapter 9 Lab 1
 * Programmer: Codie Sharp
 * Date: 11/19/2020
 * Purpose: To practice the creation of multi-dimensional arrays
 */
public class SudokuPuzzle {
	private int board[][];
	private int start[][];
	private int SIZE = 16;
	private int GRID_SIZE = 4;

	public SudokuPuzzle()
	{
	 start = new int[SIZE][SIZE];
	 board = new int[SIZE][SIZE];
	}

	public String toString()
	{
		String puzzleString = "Row/Col\n      1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16\n";
		puzzleString = puzzleString +"     ------------------------------------------------\n";
		
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
			puzzleString = puzzleString +"    |__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|__|\n";
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
		addInitial(0,3,9);
		addInitial(0,5,12);
		addInitial(0,6,16);
		addInitial(0,7,6);
		addInitial(0,8,7);
		addInitial(0,9,10);
		addInitial(0,11,8);
		addInitial(0,13,4);
		
		addInitial(1,0,7);
		addInitial(1,2,14);
		addInitial(1,6,3);
		addInitial(1,8,5);
		addInitial(1,10,2);
		addInitial(1,13,13);
		addInitial(1,15,10);

		addInitial(2,0,11);
		addInitial(2,3,4);
		addInitial(2,7,2);
		addInitial(2,8,14);
		addInitial(2,12,15);
		addInitial(2,14,16);

		addInitial(3,1,3);
		addInitial(3,4,15);
		addInitial(3,6,4);
		addInitial(3,8,1);
		addInitial(3,9,11);
		addInitial(3,14,7);
		
		addInitial(4,2,2);
		addInitial(4,3,12);
		addInitial(4,5,1);
		addInitial(4,6,11);
		addInitial(4,12,7);
		addInitial(4,13,5);
		addInitial(4,14,6);
		addInitial(4,15,15);

		addInitial(5,3,7);
		addInitial(5,4,8);
		addInitial(5,8,2);
		addInitial(5,11,5);
		addInitial(5,13,9);
		
		addInitial(6,0,6);
		addInitial(6,2,15);
		addInitial(6,3,10);
		addInitial(6,4,13);
		addInitial(6,5,5);
		addInitial(6,8,9);
		addInitial(6,14,8);
		addInitial(6,15,4);

		addInitial(7,3,5);
		addInitial(7,4,10);
		addInitial(7,6,15);
		addInitial(7,9,6);
		addInitial(7,10,8);
		addInitial(7,11,13);
		addInitial(7,13,12);

		addInitial(8,2,13);
		addInitial(8,4,5);
		addInitial(8,5,3);
		addInitial(8,6,10);
		addInitial(8,9,14);
		addInitial(8,11,7);
		addInitial(8,12,9);

		addInitial(9,0,5);
		addInitial(9,1,12);
		addInitial(9,7,14);
		addInitial(9,10,4);
		addInitial(9,11,2);
		addInitial(9,12,3);
		addInitial(9,13,7);
		addInitial(9,15,8);

		addInitial(10,2,7);
		addInitial(10,4,12);
		addInitial(10,7,1);
		addInitial(10,11,10);
		addInitial(10,12,5);

		addInitial(11,0,10);
		addInitial(11,1,9);
		addInitial(11,2,8);
		addInitial(11,3,14);
		addInitial(11,9,3);
		addInitial(11,10,5);
		addInitial(11,12,13);
		addInitial(11,13,15);

		addInitial(12,1,11);
		addInitial(12,6,6);
		addInitial(12,7,15);
		addInitial(12,9,5);
		addInitial(12,11,16);
		addInitial(12,14,12);

		addInitial(13,1,5);
		addInitial(13,3,15);
		addInitial(13,7,10);
		addInitial(13,8,12);
		addInitial(13,12,2);
		addInitial(13,15,13);

		addInitial(14,0,16);
		addInitial(14,2,12);
		addInitial(14,5,11);
		addInitial(14,7,3);
		addInitial(14,9,2);
		addInitial(14,13,1);
		addInitial(14,15,7);
		
		addInitial(15,2,6);
		addInitial(15,4,4);
		addInitial(15,6,12);
		addInitial(15,7,5);
		addInitial(15,8,13);
		addInitial(15,9,9);
		addInitial(15,10,1);
		addInitial(15,12,16);
		
	}












}
