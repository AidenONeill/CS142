package Lab1;

// also question three here, optimised code
public class Lab1Q2
{
	public static void main(String args[])
	{
	 // declare a double array of size 20
	 double [] array = {10.7,4.5,16.8,9.7,12.3,9.5,1.0,6.6,19.7,2.3,0.4,15.5,25.0,30.4,15.4,6.7,34.5,18.4,11.1};
	 double temp=0.0;
	 int count=0,passes=0,comparisons=0;
	 boolean flag = true;
	//use bubble sort to run through the array and sort in ascending order
	  for(int pass=1; pass <array.length; pass++)
		{
			flag=true;

		   for(int i=0;i<array.length-1;i++)
		   {
		   	//comparisons measures the number of time a variable is compared against another
		   	comparisons++;
			if(array[i]>array[i+1])
			{
				flag = false;
			//count measures the number or times a variable is swapped
			 count++;
			 temp=array[i];
			 array[i]=array[i+1];
			 array[i+1]=temp;
			}
		   }
		   if(flag==true)
		   {
		   break;
		   }
		  	for(int j=0;j<+array.length-1;j++)
		  	{
		  		System.out.print(array[j]+ " ");

		  }
		  //passes counts the number of times the outer loop executes
		  passes++;
		  System.out.println();

		  }
		  	System.out.println("Number of Swaps made is: "+ count);
		  	System.out.println("Number of Comparisons made is: "+ comparisons);
		  	System.out.println("Number of Passes made is: "+ passes);



	}
}