import java.lang.*;
import java.util.*;

//There are three types of  errors in program - syntax errors, logical error and runtime errors
//Syntax and logical errors are faced by programers
//Runtime error are faced by users
//These runtime errors are called exceptions

class Main
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        
        try 
        {
            c = a/b;
            System.out.println("Result is "+c);
        } 
        catch(ArithmeticException e) 
        {
            System.out.println("Division by Zero Error");
            
        }
    }
}
