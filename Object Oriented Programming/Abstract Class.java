import java.lang.*;
import java.util.*;

//A class having atleast one abstract method is called an abstract class
//abstract keyword is used to define a class as abstract
//abstract classes are used to achieve polymorphism
abstract class Parent
{
    public Parent()
    {
        System.out.println("Parent class constructor");
    }
    
    public void function1()
    {
        System.out.println("Normal function");
    }
    
    //abstract function - it does not have a body and is Overrided in class which inherits from this class
    abstract void function2();
}

//if a child class inherits from a abstract class, then it should Override all the abstract methods presnt in that abstract class
// if it dosen't do the same, then it also becomes a abstract class

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child class constructor");
    }
    //function2 from abstract class is overrided here
    public void function2()
    {
        System.out.println("function2 is Overrided in Child class");
    }
}

//we cannot create objects of abstract classes
//only references of abstract classes can be created

class Main
{
    public static void main (String[] args) 
    {
        //this statement is not allowed as we cannot create objects of abstract class
        //Parent p1 = new Parent();
        
        Parent p1 = new Child();
        p1.function1();
        p1.function2();
    }
}
