package Lab2;

public class Lab2Q2
{
   public static void main(String args[])
   {
     int  a = 0,e = 0, x = 0, o = 0, u = 0;
     String st = new String(args[0]);//takes in string from command line
     String two = st.toLowerCase();// sets the string to lower case
     int length = two.length();


     //for loop to run through the String and count the number of each vowel
        for(int i=0;i<=length-1;i++)
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
	           i++;
			}
	        else if(two.charAt(i)=='o')
			{
	          o++;
			}
	        else if(two.charAt(i)=='u')
			{
	          u++;
			}

  	}
        int count = a+e+x+o+u;	//gets the total vowel count
	System.out.println("The string is " + length + " chars long and has " + a + " instances of a ,"+ e + " instances of e ,"+ x + " instances of i ," + o + " instances of o ,"+ u + " instances of u and has a total of "+ count+ " vowels");

   }
}
