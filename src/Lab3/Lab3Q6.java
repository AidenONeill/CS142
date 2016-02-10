package Lab3;

public class Lab3Q6
{
   public static void main(String args[])
   {
   	int row = 10, columns = 10;
   	int [][] array = new int [row][columns];

	System.out.println("    |   1	2	3	4	5	6	7	8	9	");
	System.out.println("_____________________________________________");

   	 for(int i =1;i<=row-1;i++)//nested loop to run through the 2D array and multiply the row by column to get the element of the two
     {
     	System.out.print(i+"   |   ");
      	for(int j =1;j<=columns-1;j++)
     	{
         array[i][j] = (i)*(j);
         System.out.print(array[i][j]+"	");
     	}
        System.out.print("\n");
      }


   }

}
