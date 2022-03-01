import java.lang.*;
import java.util.*;

class Outer
{
    static int x = 10;
    public int y = 20;
    
    static class Inner
    {
        void display()
        {
            //static inner classes can only access the static members of outer classes
            System.out.println("Value of x : "+x); //this is allowed
            
            //This is not allowed because y is not  static memeber
            //System.out.println("Value of y : "+y);
        }
    }
}


class Main
{
    public static void main(String args[])
    {
        Outer.Inner oI1 = new Outer.Inner();
        oI1.display();
    }
}
