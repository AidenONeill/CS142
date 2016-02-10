package Lab4;

public class Lab4Q1
{
	public static void main(String args[])
	{
		detectDuplicateLetter("evnan");
	}
	public static void detectDuplicateLetter(String s1)
	{
		boolean dupe = false;

		for(int i=0;i<=s1.length()-1;i++)//nested loop to run though the string
		{

			for(int j=(i+1);j<=s1.length()-1;j++)//compares letter i to letter i+1
			{

				if(s1.charAt(i)==s1.charAt(j))
				{
					dupe = true;
				}
			}
		}
		if(dupe==true)//prints if boolean if true
		{
			System.out.println("Duplicate letter found" );
		}
	}
}