import java.lang.*;
import java.util.*;

class Super
{
    final void function1()
    {
        System.out.println("Inside function1");
    }
    
    
}

class Sub extends Super
{
    //functions defined as final cannnot be overrided
    //we cannnot override the function1 here
    
    public void function2()
    {
        System.out.println("Inside function2");
    }
}


class Main
{
    public static void main(String args[])
    {
        Sub s1 = new Sub();
        s1.function1();
        s1.function2();
    }
}
