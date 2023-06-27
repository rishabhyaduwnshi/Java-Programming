import java.lang.*;
import java.util.*;

class Main
{
    public static void main (String[] args) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);
        
        //for deleting first element
        pq.poll();
        
        Iterator it = pq.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        
        System.out.println(pq.peek());
    }
    
}
