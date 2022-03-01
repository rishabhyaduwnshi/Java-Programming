import java.lang.*;
import java.util.*;


//Abstract class for which we cannot create any object
abstract class My
{
    abstract void display();
}

class Outer
{
    public void function1()
    {
        //Creating the object of abstract class My
        My m1 = new My()
        {
            //display function of My class is overrided here
            public void display()
            {
                System.out.println("Inside the display function of abstract class object");
            }
        };
        m1.display();
    }
    
}

class Main
{
    public static void main(String args[])
    {
        Outer o1 = new Outer();
        o1.function1();
        
    }
}
