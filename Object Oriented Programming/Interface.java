import java.lang.*;
import java.util.*;

//Interface is an abstract class with all the methods as abstract
//Used to achive polymorphism

interface Test1
{
    void function1();
    void function2();
}

class Test2 implements Test1
{
    public void function1()
    {
        System.out.println("Function 1");
    }
    
    public void function2()
    {
        System.out.println("Function 2");
    }
}


class Main
{
    public static void main (String[] args) 
    {
        Test1 t1 = new Test2();
        t1.function1();
        t1.function2();
    }
    
}
