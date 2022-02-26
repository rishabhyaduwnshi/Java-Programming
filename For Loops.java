import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        long fact = 1;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        x = sc.nextInt();
        for(long i=1;i<=x;i++)
        fact = fact*i;
        
        System.out.printf("Factorial of %d is %d", x,fact);
    }
}
