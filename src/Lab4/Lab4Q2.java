package Lab4;

public class Lab4Q2
{
	public static void main(String args[])
	{
		detectPalindrome("racecar");
	}
	public static void detectPalindrome(String s1)
	{
		boolean palin = true;
		int j = 0;
        j = s1.length()-1;

		for(int i=0;i<=j;i++,j--) //loop to run through the string and compare the first letter to last, both i and j move up and down one respectively
		{

			if(s1.charAt(i)!=s1.charAt(j))// if statement to set a boolean variable true of false
		   {
		    palin = false;

		   }
		   else
		   {
			palin = true;

		   }



		}
		if(palin == true)//prints if boolean if true
		{
			System.out.println("Palindrome detected" );
		}
	}
}