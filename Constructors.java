import java.lang.*;
import java.util.*;

class Rectangle
{
    private int length;
    private int breadth;
    
    //Constructor
    public Rectangle()
    {
        length = 1;
        breadth = 1;
    }
    
    //Constructor
    public Rectangle(int l, int b)
    {
        setLength(l);
        setBreadth(b);
    }
    
    public void setLength(int x)
    {
        if(x>0)
            length = x;
        else 
            length = 1;
    }
    
    public void setBreadth(int x)
    {
        if(x>0)
            breadth = x;
        else 
            breadth = 1;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getBreadth()
    {
        return breadth;
    }
    
    public int area()
    {
        return length*breadth;
    }
    
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}

class Main
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setBreadth(3);
        
        System.out.println("Area of Rectangle is "+r1.area());
        System.out.println("Perimeter of Rectangle is "+r1.perimeter());
    }
}
