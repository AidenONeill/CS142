package Lab8;


/**
 * Class to determine a fibonacci number given its term in the sequence, both an iteritive example and a recursive example.
 * 
 * @author (Aiden O'Neill) 
 * @version (1.0 , 23/4/15)
 */
public class FibonacciSequence
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(IterFib(i) + ", ");
        }
        
        System.out.println(" ");
        
        for(int i=1;i<=10;i++)
        {
            System.out.print(RecurFib(i) + ", ");
        }        
        
    }
    public static int IterFib(int term)
    {
        
        if(term == 1)
        {
            return 1;
        }
        
        int fib1=1, fib2=1, fibonacci=1;
        
        for(int i= 3; i<= term; i++)
        {
            fibonacci = fib1 + fib2; //Fibonacci number is sum of previous two Fibonacci numbers
            fib1 = fib2;
            fib2 = fibonacci;
 
        }
        return fibonacci; //returns the number
        
    }
    
    public static int RecurFib(int term)
    {
        
        if(term <= 1) //base case
        {
            return term;
        }

        else
        {
             return RecurFib(term-1) + RecurFib(term-2);       
        
    }
        
    
}
}
