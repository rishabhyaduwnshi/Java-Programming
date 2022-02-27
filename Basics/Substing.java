import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        String url;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a website : ");
        url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http"))
        System.out.println("HTTP protocol");
        
        else if(protocol.equals("ftp"))
        System.out.println("File Transfer Protocol");
        
        else 
        System.out.println("Unknow");
        
        
        
    }
}
