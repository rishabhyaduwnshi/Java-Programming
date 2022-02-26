import java.lang.*;
import java.util.*;

class Circle
{
    public double radius;
    public double area()
    {
        return radius*radius*Math.PI;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

class Main
{
    public static void main(String args[])
    {
        Circle c1 = new Circle();
        c1.radius = 5;
        System.out.println("Area of Circle C1  is " + c1.area());
        System.out.println("Perimeter of Circle C1  is " + c1.perimeter());
    }
}
