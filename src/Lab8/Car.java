package Lab8;


/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    
    //attributes 
    private String trans ;
    private String colour; 

    /**
     * Constructor for objects of class Car
     */
    public Car(double type, int wheels, String reg, String trans, String colour)
    {
        super(type,wheels,reg);
        this.trans = trans;
        this.colour = colour;
        

    }
    public String getTrans()
    {
        return trans;
    }
    public String getColour()
    {
        return colour;
    }
    public void setColour(String one)
    {
        one = colour;
    }
    public void move()
    {
        System.out.println("The car is moving quickly");
    }
    public boolean equals(Car otherCar)
    { 
        boolean isEqual = false; 
        
        isEqual = this.getType() == otherCar.getType() & 
                  this.getColour() == otherCar.getColour() & 
                  this.getTrans() == otherCar.getTrans(); 
        
        return isEqual; 
}
}
