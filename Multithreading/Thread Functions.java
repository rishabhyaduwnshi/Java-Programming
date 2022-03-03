import java.lang.*;
import java.util.*;

//-------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXX---------------------------------
                                        
                                        //Constructors in Thread

// Thread() - Default Connstructor
// Thread(Runnable r) - we can pass a class which implements a runnabble interface
// Thread(Runnable r, string name) we can pass the name of thread as a String
// Thread(ThreadGroup g, String name) name of the thread group
// Thread (String name)

//-------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXX---------------------------------

                                   //Get Methods of Thread Class
                                
// long getId() - returns the id of Thread
// String getName() - returns the name of thread
// int getPriority() - retuns the priority if thread
// ThreadState getState() - returns the state of thread
//ThreadGroup getThreadGroup() - returns the refrence of thread which to which the thread belongs

//-------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXX---------------------------------

                                   //Set Methods of Thread Class

//void setName()
//void setPriority(int p)
//void setDaemon(boolean b) - a Daemon thread is a background thread with least priority

//-------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXX---------------------------------

                                     //Enquiry Methods of Thread Class
                
// boolean isAlive()
// boolean isDaemon()
// boolean isInterrupt()

//-------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXX---------------------------------
                                       
                                       //Instance Methods
                                    
//void interrupt() - for innterrupting a Thread
// void join() - by calling this function, a Thread can wait for other threads to complete
//void join(long milliseconds) - takes milliseconds are an aggument


//-------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXX---------------------------------

                                       //  Static Methods
                                       
// int activeCount() - returns the no of active threads in a thread group
//Thread currentThread() - returns the refrence of a current thread
//void yield() - it is used for holding a thread for some time so that other low priority threads can execute
//void dumpStack() - it tells the contents of stack 

class Main
{
    public static void main (String[] args) 
    {
        System.out.println("Thread Functions");
    }
}
