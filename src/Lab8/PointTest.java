package Lab8;


/**
 * Testing the point class
 * 
 * @author (Aiden O'Neill) 
 * @version (1.0, 22/4/15)
 */
public class PointTest
{
   public static void main(String args[])
   {
       Point one = new Point();
       one.setXValue(5.0);
       one.setYValue(2.0);
       //System.out.println(one.getXValue());
       //System.out.println(one.getYValue());
       
       Point two = new Point();
       two.setXValue(10.0);
       two.setYValue(7.0);
       //System.out.println(two.getXValue());
       //System.out.println(two.getYValue());
       
       Point three = new Point();
       
       System.out.println("Distance between point p and declared point is: "+ one.getDistance(two));
       System.out.println("Distance between point a and b is: " + (three.getDistance(one, two)));
       
   }
}
