import java.lang.*;
import java.util.*;

class staticPractice
{
    static int x = 10;
    
    static
    {
        System.out.println("In the first static block, Initially x = "+x);
    }
    
    static
    {
        x = 20;
        System.out.println("In the second static block, Making x = "+x);
    }
    
    static
    {
        x = 30;
        System.out.println("In the third static block, Making x = "+x);
    }
}



class Main
{
    public static void main(String args[])
    {
        staticPractice s1 = new staticPractice();
    }
}
