import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
       int number;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number : ");
       number = sc.nextInt();
       
       int remainder,reverse=0;
       while(number != 0)
       {
           remainder = number%10;
           reverse = reverse*10+remainder;
           number = number/10;
       }
       
       while(reverse != 0)
       {
           remainder = reverse%10;
           switch(remainder)
           {
               case 0:
                   System.out.print("Zero ");
                   break;
                case 1:
                   System.out.print("One ");
                   break;
                case 2:
                   System.out.print("Two ");
                   break;
                case 3:
                   System.out.print("Three ");
                   break;
                case 4:
                   System.out.print("Four ");
                   break;
                case 5:
                   System.out.print("Five ");
                   break;
                case 6:
                   System.out.print("Six ");
                   break;
                case 7:
                   System.out.print("Seven ");
                   break;
                case 8:
                   System.out.print("Eight ");
                   break;
                case 9:
                   System.out.print("Nine ");
                   break;
           }
           
           reverse = reverse/10;
           
       }
    }
}
