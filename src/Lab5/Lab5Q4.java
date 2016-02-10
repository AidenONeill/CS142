package Lab5;


public class Lab5Q4
{
	public static void main(String args[])
	{
		int [][] numberGrid ={ {2,4,6},{1,5,7},{14,2,9} };
		twoDArray(numberGrid);//calls method



	}
	public static void twoDArray(int [][]numberGrid) // declare a new method to accept a parameter given in main of a single 2D array
	{

		for(int i=0;i<=numberGrid.length-1;i++) //nested loop to run through the rows and columns of the array
		{
			for(int j=0;j<=numberGrid.length-1;j++)
			{
				System.out.print(numberGrid[i][j]*5 + " is in position " + i + " " + j+ " "+"\n"); //prints the values of the array X 5 to the screen and lists their position in the array


		    }
		}


	}


}



