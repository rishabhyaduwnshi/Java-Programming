import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.addFirst(5);
        dq.addLast(30);
        
        dq.offerFirst(100);
        dq.offerFirst(200);
        dq.offerFirst(300);
        
        dq.offerLast(50);
        dq.offerLast(70);
        
        Iterator<Integer> it = dq.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");   
        }
    }
}
