import java.lang.*;
import java.util.*;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimension of Rectangle cannot be Negative";
    }
}

public class Main
{
    
    public int calculateArea(int length, int breadth) throws NegativeDimensionException
    {
        if(length <= 0 || breadth <= 0)
            throw new NegativeDimensionException();
            
        return length*breadth;
    }
    
    
    public int callCalculateAreaFunction(int length, int breadth) throws NegativeDimensionException
    {
        return calculateArea(length,breadth);
    }
    
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        Main mn = new Main();
        System.out.print("Enter two numbers : ");
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        try 
        {
            c = mn.calculateArea(a,b);
            System.out.println(c);
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
}
