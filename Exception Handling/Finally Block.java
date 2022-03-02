import java.lang.*;
import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        int a = 10,b = 0;
        try
        {
            int c = a/b;
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        finally
        {
            System.out.println("Program Executed");
        }
    }
}
