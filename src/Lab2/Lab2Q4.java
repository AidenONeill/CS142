package Lab2;

import java.util.Random;
import java.util.Scanner;
public class Lab2Q4
{
	public static void main(String args[])
	{
	//declare and array of size 10 and convrt strings to ints
         int num1 = Integer.parseInt(args[0]);
         int num2 = Integer.parseInt(args[1]);
         int num3 = Integer.parseInt(args[2]);
         int num4 = Integer.parseInt(args[3]);
         int num5 = Integer.parseInt(args[4]);
         int num6 = Integer.parseInt(args[5]);
         int num7 = Integer.parseInt(args[6]);
         int num8 = Integer.parseInt(args[7]);
         int num9 = Integer.parseInt(args[8]);
         int num10 = Integer.parseInt(args[9]);

	 int array[] = {num1,num2,num3,num4,num5,num6,num7,num8,num9,num10};
	 int temp = 0, pick = 0;
         Scanner keyboard = new Scanner(System.in);

         // use a nested for loop to sort the array in ascending order
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

	}
	
	 // use a for loop to print the array and ask the user to pick a number
	     for(int j=0;j<=array.length-1;j++)
             {
	      System.out.print(array[j]+ " ");
	     }
	     System.out.println();
	     System.out.println("Please pick a number from the array");
	     pick = keyboard.nextInt();


               

	    //declare ints and strings and boolean for the number game
	    int low = 0, high = array.length-1, middle = 0;
	    char d = ' ';
	    boolean found = false;

                //use a while loop to play the game


		 while(!found)
		 {
           	  middle = (high+low)/2;
		  System.out.println("Is your Number "+array[middle]);
	          System.out.println("Please Enter H for Higher,L for Lower or C for Correct");
	          d = keyboard.findInLine(".").charAt(0);
	 	//use an if statement to differentiate between higher lower and correct
        	 	if(d=='C'||d=='c')
		 	{
	 		System.out.println("Your number is: " + array[middle]);
	 		found = true;
		 	}
		 	else if(d=='H'||d=='h')
	          	{
			low = middle+1;
		 	}
		 	else if(d=='L'||d=='l')
		        {
			high = middle-1;
		 	}


              }






  }

}
