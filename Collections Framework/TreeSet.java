import java.lang.*;
import java.util.*;


class Main
{
    public static void main(String args[])
    {
        
        //maintains the list in sorted order
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,50));
        ts.add(80);
        ts.addAll(List.of(10,90));
        
        Iterator it = ts.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        
    }
}
