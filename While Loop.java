import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int x,rem,rev=0;
        x = sc.nextInt();
        
        while(x != 0)
        {
            rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        
        System.out.printf("Reverse is : %d", rev);
    }
}
