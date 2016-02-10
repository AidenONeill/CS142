package Lab3;

public class Lab3Q5
{
   public static void main(String args[])
   {
// declare an array of 7 rows and 0 columns
     char array [][] = new char [7][];
// set the number of columns per row, at row 0 there is 1 column, at row 3 there are 4 columns
     array[0] = new char[1];
     array[1] = new char[2];
     array[2] = new char[3];
     array[3] = new char[4];
     array[4] = new char[3];
     array[5] = new char[2];
     array[6] = new char[1];

// fill the array with +
     for(int i =0;i<array.length;i++)
     {
      	for(int j =0;j<array[i].length;j++)
     	{
         array[i][j] = '+';
         System.out.print(array[i][j]);
     	}
        System.out.print("\n");
      }

   }
}
