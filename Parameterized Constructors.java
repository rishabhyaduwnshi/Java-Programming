import java.lang.*;
import java.util.*;

class Parent
{
    public Parent()
    {
        System.out.println("Non Parameterized Constructor of Parent");
    }
    
    public Parent(int x)
    {
        System.out.println("Parameterized Constructor of Parent");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Non Parameterized Constructor of Child");
    }
    
    public Child(int x,int y)
    {
        super(x); //super keyword is added to call the Parameterized Constructor of base class
        //If super is not written, then non Parameterized Constructor of base class is executed
        System.out.println("Parameterized Constructor of Child");
    }
}


class Main
{
    public static void main(String args[])
    {
        Child c1 = new Child(10,20);
    }
}
