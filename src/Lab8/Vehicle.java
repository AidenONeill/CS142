package Lab8;


/**
 * Write a description of class Vehicle here.
 * 
 * @author (Aiden O'Neill) 
 * @version (1.0, 22/4/15)
 */
public class Vehicle
{
    // instance variables - replace the example below with your own
    private double MotorType;
    private int NoOfWheels;
    private String RegistrationNo;

    /**
     * Default Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        MotorType = 1.2;
        NoOfWheels = 4;
        RegistrationNo = "04-KE-0000";
        
    }
        /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(double type, int wheels,String reg)
    {
        MotorType = type;
        NoOfWheels = wheels;
        RegistrationNo=reg;
        
    }
    public double getType()
    {
        return MotorType;
    }
    public int getWheels()
    {
        return NoOfWheels;
    }    
    public String getReg()
    {
        return RegistrationNo;
    }    
    public void setType(double d)
    {
        d = MotorType;
    }
    public void getType(String s1)
    {
        s1 = RegistrationNo;
    } 
    public void move()
    {
        System.out.println("Vehicle is moving");
    }
}
