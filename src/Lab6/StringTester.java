package Lab6;


/**
 * Program to test if a string is an anagram or a palindrome.
 * 
 * @author (Aiden O Neill) 
 * @version (1.0, 26 March 2015)
 */
public class StringTester
{
    public static void main(String args[])
    {
        detectPalindrome("Hellolle");
        detectAnagram("Astronomer","Moon Starer");
  
        
    }
    public static void detectPalindrome(String s1)
	{
	    int j = s1.length()-1;
	    boolean flag = false;
	    for(int i=0;i<j;i++,j--)
	    {
	        if(s1.charAt(i)!=s1.charAt(j))
	        {
	            flag = false;
	        }
	        else
	        {
	            flag = true;
	        }
	    }
	    	if(flag == true)
            {
            System.out.println("Palindrome found");
            }
            else if(flag == false)
            {
            System.out.println("Palindrome not found");
            }        
	        
	}
	public static void detectAnagram(String s1,String s2)
	{
	    boolean flag2 = false;
	    for(int i=0;i<=s1.length()-1;i++)
	    {
	        if(s1.charAt(i)!= ' ')
	        {
	            for(int j =0;j<=s2.length()-1;j++)
	            {
	                if(s1.charAt(i)==s2.charAt(j))
	                {
	                    s2.replace(s2.charAt(j), '*');
	                    flag2 = true;
	                }
	                else
	                {
	                    flag2 = false;
	                    
	                }
	            }
	           
	        }    
	    }
	    if(flag2 == true)
        {
         System.out.println("The Strings are an Anagram of each other");
        }
        else if(flag2 == false)
        {
         System.out.println("The strings are not an Anagram");
        }    
	}
	
	
   
}
