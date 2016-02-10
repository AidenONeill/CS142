package Lab5;

public class Lab5Q6
{
	public static void main(String args[])
	{
		vowelCount("Escape of the Gorrilion");//calls method


	}
	public static void vowelCount(String one)//declare a method that takes in one string parameter
	{
	 int  a = 0,e = 0, x = 0, o = 0, u = 0 ,none = 0;
     String two = one.toLowerCase();//sets taken in string to lower case
     int length = two.length(); //sets a variable length to the length of the accepted string



     for(int i=0;i<=length-1;i++)// for loop used to run through string and find the vowels
     	{
		    if(two.charAt(i)=='a')
	        {
	          a++;
			}
	        else if(two.charAt(i)=='e')
			{
	           e++;
			}
	        else if(two.charAt(i)=='i')
			{
	           x++;
			}
	        else if(two.charAt(i)=='o')
			{
	          o++;
			}
	        else if(two.charAt(i)=='u')
			{
	          u++;
			}
			else//counts the non vowels
			{
				none++;
			}

  	}
  	System.out.println("The String has " + a + " letter a, "+ e + " letter e, "+ x + " letter i, "+ o + " letter o, "+ u + " letter u and " + none + "  non vowels");


  	}






}