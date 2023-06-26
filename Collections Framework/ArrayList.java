import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //creating an ArrayList
        ArrayList<Integer> list1 = new ArrayList<>(20);
        
        //adding elements
        list1.add(10);
        list1.add(20);
        
        ArrayList<Integer> list2 = new ArrayList<>(10);
        list2.add(30);
        
        //adding list to another list
        list1.addAll(list2);
        
        //Check if an element is already present
        if(list1.contains(30))
            System.out.println("Yes");
            
            
        //Prinitng the values
        for(int i=0;i<list1.size();i++)
            System.out.print(list1.get(i) + " ");
            
        System.out.println(" ");
            
        //Using for each loop
        for(Integer x : list1)
            System.out.print(x + " ");
        
        System.out.println(" ");
        
        //Using iterator
        Iterator<Integer> it = list1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        
        System.out.println(" ");
        
        //Using ListIterator. It provides bidirectional access
        ListIterator<Integer> lit = list1.listIterator();
        while(lit.hasNext())
        {
            System.out.print(lit.next() + " ");
        }
        
        
    }
}
