import java.lang.*;
import java.util.*;

//Runnable is an interface
//Runnable has only only method that is run()

class myThread implements Runnable
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
}

class Main
{
    public static void main (String[] args) 
    {
        myThread M = new myThread();
        Thread t = new Thread(M); //we are attching the object of myThread class to thread class
        t.start();
        int i=0;
        while(i<1000)
        {
            System.out.println("World "+i);
            i++;
        }
    }
}


