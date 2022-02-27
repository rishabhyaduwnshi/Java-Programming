import java.lang.*;
import java.util.*;

public class Main
{
    //Varibale no of arguments passing
    static void show(int ...X)
    {
        for(int x: X)
            System.out.printf("%d ",x);
            System.out.println("");
    }
    
    public static void main(String args[])
    {
        show(11,22,33,4,4);
        
        int Array[] = {1,2,3,4,5};
        //function can be called using array also
        show(Array);
    }
    
}
