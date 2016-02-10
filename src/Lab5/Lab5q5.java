package Lab5;


public class Lab5q5
{
	public static void main(String args[])
	{
		double [] myNumbers = {1, 3, 6, 4, 8, 12, 2};
		scaleArray(myNumbers, 5);//calls method


	}
	public static void scaleArray(double [] myNumbers, double one)//method to accept two parameters, one a double array and one a double variable
	{
		for(int i=0;i<=myNumbers.length-1;i++)
		{
		 System.out.print(myNumbers[i]/one + "  " );//prints the numbers of the array divided by the double paramater taken in
		}


	}


}