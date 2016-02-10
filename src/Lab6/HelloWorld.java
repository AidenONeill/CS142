package Lab6;


/**
 * Simple program designed to print out a statement to the screen
 * 
 * @author (Aiden O Neill) 
 * @version (1.0, 24 March 2015)
 * @param name (name selected by the user)
 */
public class HelloWorld
{
   public static void main(String args[])
   {
       sayHello("Aiden");
   }
   public static void sayHello(String name)// method to print out a hello statment, it accepts a single string paramater
   {
       System.out.println("Hello " + name);
   }
}
