import java.lang.*;
import java.util.*;

class Main
{
    static int area(int length, int breadth) throws Exception
    {
        //since here we are throwing an exception, then we must declare with this function that it throws an exception
        if(length<0 || breadth <0)
            throw new Exception(); 
        return length*breadth;
    }
    
    //this function is calling area function which throws an Exception, so either is should catch that exception or throw it to 
    //it's calling function
    static void function2() throws Exception
    {
        area(10,-5);
    }
    
    
    public static void main (String[] args) 
    {
        try
        {
            function2();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
