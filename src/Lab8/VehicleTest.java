package Lab8;


/**
 * Testing the Vehicle Superclass and its subclasses.
 *
 * @author (Aiden O'Neill)
 * @version (1.0, 22/4/15)
 */
public class VehicleTest
{
   public static void main (String args[])
   {
       Car Toyota = new Car(1.6,4,"03-KE-1234","M","Red");
       Toyota.move();
       System.out.println("The car is of type "+ Toyota.getType()+"L");
       System.out.println("The car has "+ Toyota.getWheels()+ " wheels");
       System.out.println("The cars registration is: " + Toyota.getReg());
       System.out.println("The car's transmission is of type " + Toyota.getTrans());
       System.out.println("The car is: " + Toyota.getColour());
       
       System.out.println(" ");

       Car Honda = new Car(1.6,4,"03-KE-1234","A","Red");
       Honda.move();
       System.out.println("The car is of type " + Honda.getType()+"L");
       System.out.println("The car has " + Honda.getWheels()+ " wheels");
       System.out.println("The carsks registration is: " + Honda.getReg());
       System.out.println("The car's transmission is of type " + Honda.getTrans());
       System.out.println("The car is " + Honda.getColour());
       
       System.out.println(" ");


       Truck one = new Truck(3.5,8,"03-D-1234",true,120);
       one.move();
       System.out.println("The truck is of type " + one.getType() +"L");
       System.out.println("The trucks has " + one.getWheels() + " wheels");
       System.out.println("The trucks registration is: " + one.getReg());
       System.out.println("Does the truck have a trailer: " + Boolean.toString(one.getTrailer()));
       System.out.println("Top Speed of the Truck is: "+one.getTopSpeed());

       System.out.println("Does the first car match the second car: " + Boolean.toString(Toyota.equals(Honda)));


   }
}
