import java.lang.*;
import java.util.*;

//java provides a class called Thread and an interface called Runnable for achieving multithreading
//the mechanism for multithreading is present in thread class
//without thread class, we cannot achieve multithreading

//extends thread is used when a class is not inheriting from any other class
//Runnable is used when a class is already inheriting from some other class and it still wants to achieve multithreading since in java
//c class can inherit from only one class


//multithreading used Thread class
class myThread extends Thread
{
    //run() method is a built in method in thread class and it must be overrided for achieving multithreading
    public void run()//overriding run() method here
    {
        int i=0;
        while(i<500)
        {
            System.out.println("Hello "+ i);
            i++;
        }
    }
    
}

class Main
{
    public static void main (String[] args) 
    {
        myThread t = new myThread();
        //start method is builtin method in thread class which call the run method
        t.start();//for starting the thread
        int i=0;
        while(i<500)
        {
            System.out.println("World "+ i);
            i++;
        }
    }
}




