
/**
 * Write a description of class GeometryTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
public class GeometryTester
{
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the radius of your objects?");
        double radius=input.nextDouble();
        System.out.println("What is the height of your objects?");
        double height=input.nextDouble();
        
        System.out.printf("Volume of sphere: %f\nSurface Area of sphere: %f\n"+
        "Volume of cylinder: %f\nSurface Area of cylinder: %f\n"+
        "Volume of cone: %f\nSurface Area of cone: %f\n",Geometry.sphereVolume(radius),
        Geometry.sphereSurface(radius),Geometry.cylinderVolume(radius,height),Geometry.cylinderSurface(radius,height),
        Geometry.coneVolume(radius,height),Geometry.coneSurface(radius,height));
        
        System.out.println("What is your point X value?");
        double x=input.nextDouble();
        System.out.println("What is your point Y value?");
        double y=input.nextDouble();
        System.out.println("What is your Ellipse X value?");
        double ellipseX=input.nextDouble();
        System.out.println("What is your Ellipse Y value?");
        double ellipseY=input.nextDouble();
        System.out.println("What is your Ellipse Width value?");
        double ellipseWidth=input.nextDouble();
        System.out.println("What is your Ellipse Height value?");
        double ellipseHeight=input.nextDouble();
        
        Point2D.Double point=new Point2D.Double(x,y);
        Ellipse2D.Double ellipse=new Ellipse2D.Double(ellipseX,ellipseY,ellipseWidth,ellipseHeight);
        
        System.out.println("Ellipse Perimeter: " + Geometry.perimeter(ellipse));
        System.out.println("Ellipse Area: " + Geometry.area(ellipse));
        System.out.println("Is on ellipse: " + Geometry.isOnBoundary(point,ellipse));
        System.out.println("Is in ellipse: " + Geometry.isInside(point,ellipse));
        
        
    }
}
