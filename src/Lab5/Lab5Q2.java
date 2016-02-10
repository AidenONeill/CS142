package Lab5;

public class Lab5Q2
{
	public static void main(String args[])
	{
		numList();//calls method


	}
	public static void numList()//declare a method to find the smallest number in a given array
	{
		double smallest = 10000000; // declare smallest as a number that the elements of the array are not likely to be greater than
		double[] numList = {11.0, 223.4, 234.55, 567.87};

		for(int j=0;j<=numList.length-1;j++)
		{
			if(numList[j]<smallest) //compares current array value with variable named smallest
			{
			 smallest = numList[j]; // if the element of the array is smaller, it stores the new value in smallest

			}

		}
		System.out.println(smallest+ " is the smallest number in the array");




	}
}