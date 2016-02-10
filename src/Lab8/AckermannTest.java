package Lab8;


/**
 * Class to test Ackermann's recursive method
 * 
 * @author (Aiden O'Neill) 
 * @version (1.0, 23/4/15)
 */
public class AckermannTest
{
    private int m = 0,n = 0 ;
   public static void main(String args[])
   {
       System.out.println(Ackermann(3,4));
    
   }
   public static int Ackermann(int m, int n)
   {
       if( m == 0)//base case
       {
           return n+1;
       }
       else if ((m>0) && (n==0))
       {
           return Ackermann(m-1,1);
           
       }
       else  // both m and n are greater than 0
       {
           return Ackermann(m-1, Ackermann(m,n-1));
                   
       }
       

}
}