package Lab5;

public class Lab5Q3
{
	public static void main(String args[])
	{
		numList(120);


	}
	public static void numList(int one) // declares a method to accept one int parmeter
	{
		int[] array = new int[one]; // sets the parameter to the array size
		for(int i=0;i<=array.length-1;i++)
		{
			if(i%2==0) //modulus check if the array index is odd or even.
			{
				array[i]=i;//sets the array index as a value if it is even
			}
			else
			{
				array [i] = -1;//sets value of -1 if it is odd
			}
		}
		    for(int j=0;j<=array.length-1;j++)//for loop to print array to screen
			{
			 System.out.print(array[j]+ " ");
		    }


	}


}