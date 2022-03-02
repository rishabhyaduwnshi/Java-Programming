import java.lang.*;
import java.util.*;

class Main extends Thread
{
    public void run()
    {
        int i=0;
        while(i<1000)
        {
            System.out.println("Hello "+i);
            i++;
        }
    }
    
    public static void main (String[] args) 
    {
        Main t = new Main();
        t.start();
        
        int i=0;
        while(i<1000)
        {
            System.out.println("World "+i);
            i++;
        }
        
    }
}



