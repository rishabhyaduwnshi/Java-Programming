import java.lang.*;
import java.util.*;


class Main
{
    public static void main(String args[])
    {
        HashSet<Integer> hs1 = new HashSet<>();
        
        //declaring with capacity
        HashSet<Integer> hs2 = new HashSet<>(20);
        
        //declaring with capacity & loading factor
        HashSet<Integer> hs3 = new HashSet<>(20,0.5f);
        
        
        hs1.add(10);
        hs1.add(20);
        hs1.add(5);
        hs1.add(15);
        
        Iterator<Integer> it = hs1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }
}
