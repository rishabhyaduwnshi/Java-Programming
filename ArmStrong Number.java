import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
       int number,remainder = 0,armNumber = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       number = sc.nextInt();
       int forCheck = number;
       while(number != 0)
       {
           remainder = number%10;
           armNumber = armNumber+remainder*remainder*remainder;
           number = number/10;
       }
       
       if(forCheck == armNumber)
       System.out.printf("%d is ArmStrong Number", forCheck);
       else
       System.out.println("Not an ArmStrong Number");
    }
}
