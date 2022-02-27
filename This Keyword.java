import java.lang.*;
import java.util.*;

class Rectangle
{
    public int length;
    public int breadth;
    
    public Rectangle(int length, int breadth)
    {
        //this keyword is used to resolve name conflict, it means upon the current object
        this.length = length; 
        this.breadth = breadth;
    }
    
    public void display()
    {
        System.out.println("Length of Rectangle is : "+this.length);
        System.out.println("Breadth of Rectangle is : "+this.breadth);
        
    }
}


class Main
{
    public static void main(String args[])
    {
        Rectangle r1 = new Rectangle(10,5);
        r1.display();
    }
}
