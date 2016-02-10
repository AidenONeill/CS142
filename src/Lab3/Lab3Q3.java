package Lab3;

public class Lab3Q3
{
	public static void main(String args[])
	{
		factorial(2);


	}

		public static void factorial(int one)//simple method to print the factoral of number 1-10 to the screen
	{
		int fact = 1;
		for(int i = 1;i<=10;i++)
		{
		 fact = fact*i;
		 System.out.println(i+"! is " + fact);
		}



	}
}