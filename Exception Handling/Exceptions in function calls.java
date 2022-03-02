import java.lang.*;
import java.util.*;

class Main
{
    static int function1()
    {
        return 20/0;
    }
    
    static void function2()
    {
        function1();
    }
    
    static void function3()
    {
        function2();
    }
    
    public static void main (String[] args) 
    {
        try
        {
            function3();
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
