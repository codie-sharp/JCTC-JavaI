/* Chapter 9 Lab 1
 * Programmer: Codie Sharp
 * Date: 11/18/2020
 * Purpose: To practice the creation of multi-dimensional arrays
 */

public class Ch9Lab1 {
	
	public static void main(String[] args) {
		//Declarations
		String [][] calendar = new String [7][7];
		int row, column, j = 1;
		
		calendar[0][0] = " S";
		calendar[0][1] = " M";
		calendar [0][2] = " T";
		calendar[0][3] = " W";
		calendar[0][4] = " R";
		calendar [0][5] = " F";
		calendar [0][6] = " S";
		
		for(row = 1; row <= 1; row++) 
		{
			for(column = 0; column <= 2; column++) 
			{
				calendar[row][column] = "  ";
			}
			for(column = 3; column <= 6; column++) 
			{
				calendar[row][column] = " " +String.valueOf(j);
				j++;
			}
		}
		j = 5;
		for(row = 2; row <= 2; row++) 
		{
			for(column = 0; column < 5; column++)
			{
				calendar[row][column] = " " +String.valueOf(j);
				j++;
			}
			for(column = 5; column < 7; column++)
			{
				calendar[row][column] = String.valueOf(j);
				j++;
			}
		}
		for(row = 3; row < 7; row++)
		{
			for(column = 0; column < 7; column++)
			{
				if(j == 11)
					calendar[row][column] = String.valueOf(j);
				else if(j > 11 && j <= 30)
				{
					calendar[row][column] = String.valueOf(j);
				}
				else
					calendar[row][column] = " ";
				j++;
			}
		}
		
		System.out.println("   April 2020 Calendar");
		for(row = 0; row < calendar.length; row++)
		{
			for(column = 0; column < calendar[row].length; column++)
			{
				System.out.print(calendar[row][column] +"  ");
			}
			System.out.println();
		}
		
	}
}
