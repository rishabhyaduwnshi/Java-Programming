import java.lang.*;
import java.util.*;

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

class grandChild extends Child
{
    public grandChild()
    {
        System.out.println("Grand Child Constructor");
    }
}
class Main
{
    public static void main(String args[])
    {
        //No matter upto which level we have done inheritance, the Constructors are executed level by level
        //In this example, first parent class Constructor is executed, then child, and finally grandChild constructor
        grandChild g1 = new grandChild();
    }
}
