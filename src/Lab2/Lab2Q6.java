package Lab2;

public class Lab2Q6
{
   public static void main(String args[])
   {
     int num1 = Integer.parseInt(args[0]);
     int num2 = Integer.parseInt(args[1]);
     char array [][] = new char [num1][num2];//sents array size based on strings taken in on the command line


     for(int i =0;i<num1;i++)//nested loop to print a 2d array to the screen, adding a * to every position
     {
      	for(int j =0;j<num2;j++)
     	{
         array[i][j] = '*';
         System.out.print(array[i][j] + " ");
     	}
        System.out.print("\n");
      }

   }
}
