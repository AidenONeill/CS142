package Lab8;


/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Truck extends Vehicle
{
    
    //attributes 
    private Boolean trailer ;
    private int topSpeed; 

    /**
     * Constructor for objects of class Car
     */
    public Truck(double type, int wheels, String reg, boolean trailer, int topSpeed)
    {
        super(type,wheels,reg);
        this.trailer = trailer;
        this.topSpeed = topSpeed;
        

    }
    public boolean getTrailer()
    {
        return trailer;
    }
    public int getTopSpeed()
    {
        return topSpeed;
    }
    public void setTralier(boolean flag)
    {
        flag = trailer;
    }
    public void move()
    {
        System.out.println("The Truck is moving slowly");
    }

}
