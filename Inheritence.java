import java.lang.*;
import java.util.*;

class Circle
{
    public double radius;
    public Circle()
    {
        radius = 0;
    }
    
    public Circle(int r)
    {
        radius = r;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
}

//Inheritence with example of Circle & Cylinder
class Cylinder extends Circle
{
    public int height;
    public Cylinder()
    {
        height = 0;
    }
    
    public Cylinder(int h)
    {
        height = h;
    }
    
    public double volume()
    {
        return area()*height;
    }
}


class Main
{
    public static void main(String args[])
    {
        Circle Ci = new Circle();
        Ci.radius = 5;
        
        Cylinder Cy = new Cylinder();
        Cy.radius = 5;
        Cy.height = 10;
        
        System.out.println("Area of Circle is "+Ci.area());
        System.out.println("Height of Cylinder is "+Cy.volume());
    }
}
