import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        int x = 10;
        float y = 10.25f;
        char z = 'A';
        
        System.out.printf ("The values of x is %d, y is %f and z is %c \n",x,y,z);
        
        //Argument Indexing
        System.out.printf("%3$c %2$f %1$c",x,y,z);
    }
}
