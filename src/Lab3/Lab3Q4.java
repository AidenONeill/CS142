package Lab3;

public class Lab3Q4
{
	public static void main(String args[])
	{
		determineSize(4.5,4.5);//calls method and declares paramaters


	}

		public static void determineSize(double one,double two)//method to accept two double numbers and compare them
	{
	  if(one<two)
	  {
	  	System.out.println(two + " is larger than " + one);
	  }
	  if(two<one)
	  {
	  	System.out.println(one + " is larger than " + two);
	  }
	  if(one==two)
	  {
	  	System.out.println(one + " and " + two + " are the same number");
	  }



	}
}