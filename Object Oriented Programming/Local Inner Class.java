import java.lang.*;
import java.util.*;

class Outer
{
    public void display()
    {
        System.out.println("Outer Display Function");
        //Example of local inner class which is defined inside a method
        class Inner
        {
            void innerDisplay()
            {
                System.out.println("innerDisplay Function");
            }
        }
        
        Inner i = new Inner();
        i.innerDisplay();
    }
}

class Main
{
    public static void main(String args[])
    {
        Outer o1 = new Outer();
        o1.display();
        
    }
}
