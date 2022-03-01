//There are four types of access modifiers - public, private, protected, default
//Access modifiers are used for defining the accessibility level

import java.lang.*;
import java.util.*;

//Normally, a class can have three things - a data member, a method and a inner class
//data member, inner class or method can have any access modifier
//Outer class can only be default or public\

class Demo
{
    int x;
    
    public void show()
    {
        System.out.println("Hello World");
    }
    
    class innerDemo()
    {
        int y;
    }
}

//There are two ways of using a class - by creating its Object or by extending it for inheritence


//public is accessible everywhere
//private members are accessible only inside the class
//default is accessible within same package
//protected are not accessible in different package non sub class
