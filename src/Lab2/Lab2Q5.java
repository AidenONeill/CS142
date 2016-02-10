package Lab2;

public class Lab2Q5
{
   public static void main(String args[])
   {
    int array[][] = new int [4] [5];
     for(int i =0;i<4;i++)
     {
      	for(int j =0;j<5;j++)//filled an array of declared size with the number 42
     	{
         array[i][j] = 42;
         System.out.print(array[i][j] + " ");
     	}
        System.out.print("\n");

     }
   }
}
