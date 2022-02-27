import java.lang.*;
import java.util.*;

class Parent
{
    public void display()
    {
        System.out.println("Parent display function");
    }
}

class Child extends Parent
{
    public void display()
    {
        System.out.println("Child display function");
    }
}

//We have two display functions
//Here the display function is called based upon Object,
//If object is of Child, then display function implemented in Child class will be executed
//If object is of Parent, then display function implemented in Parent class will be executed

class Main
{
    public static void main(String args[])
    {
        Parent p1 = new Parent();
        p1.display(); // parent display function is callled
        
        Parent p2 = new Child();
        p2.display();// child display function is callled
    }
}
