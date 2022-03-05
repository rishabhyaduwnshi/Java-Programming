import java.lang.*;
import java.util.*; 

//interface queue extends collection

class Main
{
    public static void main (String[] args) 
    {
        add(E e); //adds the object in the last
        
        poll(); // first object of the queue is removed, if queue is empty, poll will return null
        remove(); // first object of the queue is removed, if queue is empty, throws an Exception
        
        peek(); // returns the first element of queue, if queue is empty, poll will return null
        element(); // returns the first element of queue, if queue is empty, throws an Exception
    }
    
}
