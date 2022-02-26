import java.lang.*;
import java.util.*;

class Rectangle
{
    public int length;
    public int breadth;
    
    public int perimeter()
    {
        return 2*(length+breadth);
    }
    
    public int area()
    {
        return length*breadth;
    }
    
    public boolean isSquare()
    {
        if(length == breadth)
            return true;
        else
            return false;
    }
}

class Main
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 8;
        
        System.out.println("Area of Rectangle r1 is "+r1.area());
        System.out.println("Perimeter of Rectangle r1 is "+r1.perimeter());
        
        if(r1.isSquare())
        System.out.println("Rectangle r1 is a square");
        else
        System.out.println("Rectangle r1 is not a square");
        
    }
}
