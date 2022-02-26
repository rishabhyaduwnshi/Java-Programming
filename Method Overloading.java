import java.lang.*;
import java.util.*;

public class Main
{
    static void sum(int x, int y)
    {
        System.out.printf("Sum of %d and %d is %d\n",x,y,x+y);
    }
    
    static void sum(float x, float y)
    {
        System.out.printf("Sum of %f and %f is %f",x,y,x+y);
    }
    
    public static void main(String args[])
    {
        int a = 10,b = 20;
        float x=10.15f,y=12.45f;
        sum(a,b);
        sum(x,y);
    }
    
}
