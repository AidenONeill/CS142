package Lab5;

public class Lab5Q1
{
	public static void main(String args[])
	{
		factorial(2);//calls method

	}
	public static void factorial(int one) //declare a method that accepts a single int parameter
	{
		int fact = 1,i = 1; //declare an int fact to be 1, if it was 0 it would not work

		while(i<=one) //while loop to run through the numbers less than the parameter and multiple fact by them
		{
			fact = fact*i;
			i++;

		}
		System.out.println(one+"! is "+ fact);



	}
}