import java.lang.*;
import java.util.*;

//There are four types of inner classes in java
//1 - Nested inner class
//2 - Locall inner class
//3 - Anonymous inner class
//4- Static inner class

class Outer
{
    public int x = 10;
    
    class Inner
    {
        public int y = 20;
        //Inner class can dirrectly access the data members of outer class
        public void innerDisplay()
        {
            System.out.println("Value of x is "+x);
            System.out.println("Value of y is "+y);
        }
    }
    
    void outerDisplay()
    {
        //Inside outer class, we can create the objects of Inner class
        //Outer class cannot directly access the members of innner class
        //it can access the memebers of inner class by creating objects of inner class
        
        Inner i = new Inner();
        i.innerDisplay();
        
        System.out.println("Inner class accessed by outer class upon object "+i.y);
    }
}

class Main
{
    public static void main(String args[])
    {
        //Creating an object of outer class
        Outer o1 = new Outer();
        o1.outerDisplay();
        
        //Create the object of inner class in main function
        Outer.Inner i1 = new Outer().new Inner();
        
        
    }
}
