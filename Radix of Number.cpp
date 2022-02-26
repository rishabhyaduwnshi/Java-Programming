import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        str = sc.nextLine();
        
        if(str.matches("[01]+"))
            System.out.println("Binary Number");
            
        else if(str.matches("[0-7]+"))
            System.out.println("Octal Number");
            
        else if(str.matches("[0-9]+"))
            System.out.println("Decimal Number");
            
        else if(str.matches("[0-9A-F]+"))
            System.out.println("HexaDecimal Number");
        
    }
}
