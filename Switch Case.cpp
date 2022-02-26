import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        int dayNumber;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter day number : ");
        dayNumber = sc.nextInt();
        
        switch(dayNumber)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
