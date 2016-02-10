package Lab8;


/**
 * Class to construct a point in cartesian space.
 * 
 * @author (Aiden O'Neill) 
 * @version (V 1.0, 22/4/15)
 */
public class Point
{
    // variables declared
    private double x;
    private double y;
    
    public double getXValue()
    {
        return this.x;
        
    }
    public double getYValue()
    {
        return this.y;
        
    }
    public void setXValue(double x)
    {
        this.x=x;
    }
    public void setYValue(double y)
    {
        this.y=y;
    }
    public double getDistance(Point p)
    {
       return(Math.sqrt((Math.pow(this.x-p.getXValue(), 2))+(Math.pow(this.y-p.getYValue(), 2))));
        
    }
    public double getDistance(Point a, Point b)
    {
        return(Math.sqrt((Math.pow(a.getXValue()-b.getXValue(), 2))+(Math.pow(a.getYValue()-b.getYValue(), 2))));
    }   
 
}
