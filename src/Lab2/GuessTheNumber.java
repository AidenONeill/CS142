package Lab2;

/** This program plays the game guess the number. It stores an ordered
  *	list of 10 numbers between 1 and 50. The user chooses a number and
  * the computer tries to guess the number. 
  * @author Susan Bergin
  * @version 1.0 15th February 2015
**/
import java.util.*;

public class GuessTheNumber{
	// Length of the array won't change so lets set it as final
	final static int MAX = 10;
	public static void main (String args [])
	{
		
		/*******************************************************/
		/* Step 1: Set up all the variables and objects needed */
		/*******************************************************/
		// Need a Scanner instance to get in values
		Scanner scan = new Scanner(System.in);
		// Create an array to store 10 randomly generated numbers 
		int array [] = new int[10];
		// Temporary variable used for swapping the numbers
		int temp=0;
		// Variables needed to find the number
    	int high = MAX-1, low = 0, middle=0;
		boolean found = false; String userInput = null;
		// Random Number generator
		Random rn = new Random();


		/*********************************************************/
		/* Step 2: Populate the array with random numbers [0,50] */
		/*********************************************************/
		for(int i=0; i<MAX; i++){
		    array[i]= 1+rn.nextInt(50);
		}

		
		/*********************************************************/
		/* Step 3: Sort the numbers (bubble sort algorithm)      */
		/*********************************************************/
		for(int pass=1; pass <MAX; pass++){
			for(int i=0;i<MAX-1;i++){
				if(array[i]>array[i+1]){
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		
		/*********************************************************/
		/* Step 4: Print the list and get user to choose a number*/
		/*********************************************************/
		System.out.println("Please choose a number but don't tell me what it is");
		// Print the sorted array
    	for(int i=0;i<MAX;i++)
			System.out.print(array[i] + "  ");
		System.out.println("\n\n\n\n\n\n\n*************************************");
	
     	
		
		/*********************************************************/
		/* Step 5: Lets play the game                            */
		/*********************************************************/
 		
		// Stop searching when we have checked the whole list or found the number 
		System.out.println("Let's begin the game....");
		while(low<=high&&!found)
		{
			// set the middle value (always at the middle of the search space)
			middle = (high+low)/2;
			System.out.println("COMPUTER GUESSS: " + array[middle] + " (answer either higher\\lower\\correct)");
			
			// get in user input
			userInput = scan.nextLine();
			if (userInput.equalsIgnoreCase("higher"))// search the higher space
			{
				low = middle+1;
			}
			else if(userInput.equalsIgnoreCase("lower"))
			{
				high = middle-1;
			} 
			// We found the number, so set the found flag to true to stop checking
			else if(userInput.equalsIgnoreCase("correct"))
			{
				System.out.println("Hurray! Your number " + array[middle]+ " was found at position " + middle);
				found = true;	
			} 
			else	
			{
				System.out.println("Invalid input - > ANSWER: higher or lower or correct only ");
			}
		}
		
	}
}
