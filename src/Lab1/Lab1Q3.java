package Lab1;



import java.util.Random;
import java.util.Scanner;
public class Lab1Q3
{
	public static void main(String args[])
	{
		//declare and array of size 10, a random variable, int vaules and a scanner
	 int array[] = new int[10];
	 Random r = new Random();
	 int temp = 0, pick = 0;
	 Scanner keyboard= new Scanner(System.in);
	 	 //use a for loop to add random numbers into the array
	 	for(int k=0;k<=array.length-1;k++)
	 	{
	 		array[k] = r.nextInt(50);
	 	}	// use a nested for loop to sort the array in ascending order
			for(int pass=1; pass <array.length; pass++)
				{
				for(int i=0;i<array.length-1;i++)
				   {
					if(array[i]>array[i+1])
					{
					 temp=array[i];
					 array[i]=array[i+1];
					 array[i+1]=temp;
					}
				   }

		    	}		// use a for loop to print the array and ask the user to pick a number
					   for(int j=0;j<=array.length-1;j++)
					   {
						System.out.print(array[j]+ " ");
					   }
						System.out.println();
						System.out.println("Please pick a number from the array");
						pick = keyboard.nextInt();

							 //declare ints and strings and boolean for the number game
							 int low = 0, high = array.length-1, middle = 0;
							 String a = "Higher",b = "Lower", c = "Correct", d = "";
							 boolean found = false;



							 //use a while loop to play the game




							 while(!found)
							 {
							 	middle = (high+low)/2;
							 	System.out.println("Is your Number "+array[middle]);
							    System.out.println("Please Enter Higher, Lower or Correct");
							 	d = keyboard.next();

							 	//use an if statement to differentiate between higher lower and correct
							 	if(d.equalsIgnoreCase(c))
							 	{
							 		System.out.println("Your number is: " + array[middle]);
							 		found = true;
							 	}
							 	else if(d.equalsIgnoreCase(a))
							 	{
							 		low = middle+1;
							 	}
							 	else if(d.equalsIgnoreCase(b))
							 	{
							 		high = middle-1;

							 	}



							 }






  }

}