package Lab1;

import java.util.Scanner;
import java.util.InputMismatchException;



public class Lab1Q1
{
	public static void main(String args[])
	{
		//declare an int array, a scanner
		int array[] = new int [10];
		int large = 0;
		int temp = 0;

		Scanner keyboard = new Scanner(System.in);
		// use a loop to ask the user to input 10 values



		     for(int i=0;i<=array.length-1;i++)
			  {
			//use a try catch to ensure the value is an Int
				try

				{
				 System.out.println("Please Enter an Int with the index vaule "+ i );
				 array[i]=keyboard.nextInt();
				}
				catch(InputMismatchException e)
			    {
				 System.out.println("This is not an Int, please Enter an Int with the index vaule "+ i );
				 keyboard.nextLine();
				 i--;
                 }
              }
			// use a loop to run through the array and find the largest value
				for(int j=0;j<=array.length-1;j++)
			{
				if(array[j]>large)
				{
					large = array[j];

				}

			}
				System.out.println(large + " is the largest Number in the array");


	}
}