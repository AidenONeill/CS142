package Lab4;

import java.util.*;

public class ArrayProcessing
{
	private static int array[] = new int[100];

	public static void main(String args[])
	{
		makeIntArray();
		printArray();
		int [] ar1 = {1,2,3,1,12,9,8,7,5,19};
		int [] ar2 = {4,1,0,5,10,8,6,3,15,14};
		int total = dotProduct(ar1,ar2);
		int largest = findMax(ar2);
		int large2 = findMax();

		System.out.println("The Dot product of the array's is " + total);
		System.out.println("The largest number in the array called from main is " + largest);
		System.out.println("The largest number in the static array is " + large2);


	}
	public static void makeIntArray()
	{
		Random r = new Random();

		  for(int j=0;j<=array.length-1;j++)
		  {
		   array[j] = r.nextInt(200)+1 ;
		  }
	}
		public static void printArray()
		{
			 for(int j=0;j<=array.length-1;j++)
			{
			 System.out.print(array[j]+ " ");
		    }
		    System.out.print("\n");

	   }
		 public static int dotProduct(int []array,int[]array2)
		 {
		  int total =0;
		  for(int i=0;i<array.length-1;i++)
	      {
		   total = total + (array[i]*array2[i]);
		  }
		   return total;
	     }

	     		public static int findMax(int []array)
			   {
			   	int max =array[0];
			     for(int i=0;i<=array.length-1;i++)
			     {
			     	if (array[i]>max)
			     	{
			     		max = array[i];
			     	}
			     }
			     return max;

			   }

			   	public static int findMax()
			   {

			   	int max =array[0];
			     for(int i=0;i<=array.length-1;i++)
			     {
			     	if (array[i]>max)
			     	{
			     		max = array[i];
			     	}
			     }
			     return max;

			   }

}
