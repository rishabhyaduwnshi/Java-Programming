import java.lang.*;
import java.util.*;

final class Super
{
    public int x = 10;
    public int y = 20;
    
    public void display()
    {
        System.out.println("Value of x is " +x + " and value of y is "+y);
    }
    
}

//if a class has been declared as final, it cannot be extended
//class sub extends Super - this is not allowed

class Main
{
    public static void main(String args[])
    {
        Super s1 = new Super();
        s1.display();
    }
}
