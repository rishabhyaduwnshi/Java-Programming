import java.lang.*;
import java.util.*;


class Main
{
    public static void main(String args[])
    {
        int array[] = {5,0,1,2,4};
        int result;

        System.out.println("This is an example program for testing Multiple catch blocks");
        
        try
        {
            result = array[0]/array[2];
            System.out.println("Last element is "+array[10]);
        }
        
        catch(ArrayStoreException e)
        {
            System.out.println("Division by zero error");
        }
        
        catch(ArrayIndexOutOfBoundsException f)
        {
            System.out.println("Array index out of bound");
        }
    }
}
