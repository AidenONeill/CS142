package Lab3;

public class Lab3Q2
{
	public static void main(String args[])
	{
		oddEven(1231);//calls method


	}

		public static void oddEven(int one)//method that takes in a single int variable
	{
		// if statement to determine if it is even or odd using modulus
		if(one%2==0)
		{
			System.out.println("The number is even");
		}
		else if(one%2==1)
		{
			System.out.println("The number is odd");
		}


	}
}