import java.util.Scanner;

public class SudokuPuzzleDemo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Sudoku Game: ");
		SudokuPuzzle puzzle = new SudokuPuzzle();
		puzzle.initializePuzzle();
		System.out.print("The puzzle is: \n" +puzzle);
		boolean done = false;
		while(!done)
		{
			System.out.println("What would you like to do? \n" + "Clear Puzzle(C) Set a square(S) Get possible values (G) Quit (Q)");
			String response = reader.next();
			response = response.toLowerCase(); 
			if(response.equals("q"))
			{
				System.out.println("Thanks for playing");
				done = true;
			}
			else if(response.equals("s"))
			{
				System.out.println("Which row (1-16) and column (1-16) do you want to change?");
				int row = reader.nextInt() - 1; 
				int col = reader.nextInt() - 1;
				System.out.println("What should the value (1-16) be?");
				int value = reader.nextInt();
				puzzle.addGuess(row, col, value);
			}
			if(response.equals("g"))
			{
				System.out.println("Which row (1-16) and column (1-16) do you want to get values for?");
				int row = reader.nextInt() - 1;
				int col = reader.nextInt() - 1;
				boolean valid[] = puzzle.getAllowedValues(row, col);
				System.out.print("Allowed values are: ");
				for(int i = 0; i < 16; i++) 
				{
					if(valid[i])
					System.out.print((i + 1) +" ");
				}
				System.out.println();
			}
			else if(response.equals("c"))
			{
				puzzle.reset();
			}
			System.out.print("The puzzle is now: \n" + puzzle);
			if(!puzzle.checkPuzzle())
			System.out.println("You have made an error in the puzzle.");
			else if(puzzle.isFull())
			System.out.println("Congratulations, you have completed the puzzle.");
			}
	}	
}
