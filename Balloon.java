
/**
 * Write a description of class Balloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloon
{
    public double volume;
    public double radius;
    
    public Balloon()
    {
        volume = 0;
        radius = 0;
    }
    
    public void addAir(double amounts)
    {
        volume = volume + amounts;
    }
    
    public double getVolume()
    {
        return volume;
    }
    
    public double getRadius()
    {
        radius = Math.cbrt((3*volume)/(4*Math.PI));
        return radius;
    }
    
    public double getSurfaceArea()
    {
        return 4*Math.PI*radius*radius;
    }
}
