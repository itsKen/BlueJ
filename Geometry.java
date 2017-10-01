
/**
 * A method class that return volume and surface area of 3 different geometric shapes.
 * 
 * @author (Evan Sum) 
 * @version (10/24/16)
 */
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
public class Geometry
{
    /**
     * returns volume of a sphere with the given radius.
     * (Postcondition: volume>=0)
     * @param radius radius of the sphere
     * @return volume of a sphere
     * (Precondition: radius>=0)
     */
    public static double sphereVolume(double r)
    {
        return Math.PI*(4.0/3.0)*Math.pow(r,3);
    }
    
    /**
     * returns surface area of a sphere with the given radius.
     * (Postcondition: surface area>=0)
     * @param radius radius of the sphere
     * @return surface area of a sphere
     * (Precondition: radius>=0)
     */
    public static double sphereSurface(double r)
    {
        return Math.PI*(4.0)*Math.pow(r,2);
    }
    
    /**
     * returns volume of a cylinder with the given radius and height.
     * (Postcondition: volume>=0)
     * @param radius radius of the cylinder
     * @param height height of the cylinder
     * @return volume of a cylinder
     * (Precondition: radius>=0 height>=0)
     */
    public static double cylinderVolume(double r,double h)
    {
        return Math.PI*Math.pow(r,2)*h;
    }
    
    /**
     * returns surface area of a cylinder with the given radius and height.
     * (Postcondition: cylinder>=0)
     * @param radius radius of the cylinder
     * @param height height of the cylinder
     * @return surface area of a cylinder
     * (Precondition: radius>=0 height>=0)
     */
    public static double cylinderSurface(double r, double h)
    {
        return 2*Math.PI*r*h + 2*Math.PI*Math.pow(r,2);
    }
    
    /**
     * returns volume of a cone with the given radius and height.
     * (Postcondition: volume>=0)
     * @param radius radius of the cone
     * @param height height of the cone
     * @return volume of a cone
     * (Precondition: radius>=0 height>=0)
     */
    public static double coneVolume(double r,double h)
    {
        return (1.0/3.0)*Math.PI*Math.pow(r,2)*h;
    }
    
    /**
     * returns surface area of a cone with the given radius and height.
     * (Postcondition: cone>=0)
     * @param radius radius of the cone
     * @param height height of the cone
     * @return surface area of a cone
     * (Precondition: radius>=0 height>=0)
     */
    public static double coneSurface(double r, double h)
    {
        return Math.PI*r*(r+(Math.pow((Math.pow(r,2)+Math.pow(h,2)),0.5)));
    }
    
    /**
     * 
     **/
    public static double perimeter(Ellipse2D.Double e)
    {
        double a=e.getWidth()/2.0;
        double b=e.getHeight()/2.0;
        return Math.PI*(3*(a+b)-Math.pow((3*a+b)*(3*b+a),0.5));
    }
    
    /**
     * 
     */
    public static double area(Ellipse2D.Double e)
    {
        return Math.PI*e.getWidth()/2.0*e.getHeight()/2.0;
    }
    
    
    /**
     * calculates whether or not a point is on the ellipse, only the circumference
     * (Postcondition: N/A)
     * @param p the (x,y) coordinate given by the user that is being checked
     * @param e this is the ellipse that has different points as its solution and an area inside
     * @return true or false based on calculations. 
     * (Precondition: the legth and width of the ellipse must be greater than 0)
     */
    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e)
    {
        double a=0;
        double b=0;
        double h=0;
        double k=0;
        if(e.getWidth()>=e.getHeight())
        {
             a=e.getWidth()/2.0;
             b=e.getHeight()/2.0;
             h=a+e.getX();
             k=b+e.getY();
        }
        else
        {
             a=e.getHeight()/2.0;
             b=e.getWidth()/2.0;
             h=b+e.getX();
             k=a+e.getY();
        }
        if(e.getWidth()>=e.getHeight())
        {
            if(Math.pow((p.getX()-k),2)/(a*a)+Math.pow((p.getY()-h),2)/(b*b)==1)
            {
             return true;
            }
            else
            {System.out.println(Math.pow((p.getX()-k),2)/(a*a));
             System.out.println(Math.pow((p.getY()-h),2)/(b*b));
             return false;
            }
        }
        else
        {
            if(Math.pow((p.getX()-h),2)/(b*b)+Math.pow((p.getY()-k),2)/(a*a)==1)
            { 
                return true;
            }
            else
            {System.out.println(Math.pow((p.getX()-h),2)/(b*b));
             System.out.println(Math.pow((p.getY()-k),2)/(a*a));
             return false;
            }
        }
        
    }
    
    /**
     * 
     */
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e)
    {
        double a=0;
        double b=0;
        double h=0;
        double k=0;
        if(e.getWidth()>=e.getHeight())
        {
             a=e.getWidth()/2.0;
             b=e.getHeight()/2.0;
             h=a+e.getX();
             k=b+e.getY();
        }
        else
        {
             a=e.getHeight()/2.0;
             b=e.getWidth()/2.0;
             h=b+e.getX();
             k=a+e.getY();
        }
        if(e.getWidth()>=e.getHeight())
        {
            if(Math.pow((p.getX()-k),2)/(a*a)+Math.pow((p.getY()-h),2)/(b*b)<1)
            {
             return true;
            }
            else
            {System.out.println(Math.pow((p.getX()-k),2)/(a*a));
             System.out.println(Math.pow((p.getY()-h),2)/(b*b));
             return false;
            }
        }
        else
        {
            if(Math.pow((p.getX()-h),2)/(b*b)+Math.pow((p.getY()-k),2)/(a*a)<1)
            { 
                return true;
            }
            else
            {System.out.println(Math.pow((p.getX()-h),2)/(b*b));
             System.out.println(Math.pow((p.getY()-k),2)/(a*a));
             return false;
            }
        }
        
    }
}
  

