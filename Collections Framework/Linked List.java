import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //creating an LinkedList -> Has all the functions what ArrayList has, and some extra methods. Linked List uses Doubly linked List
        LinkedList<Integer> list1 = new LinkedList<>();
        
        //adding elements
        list1.add(10);
        list1.add(20);
        
        LinkedList<Integer> list2 = new LinkedList<>();
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
        
        list1.addFirst(5);
        list1.addLast(200);
        
        //Using ListIterator. It provides bidirectional access
        ListIterator<Integer> lit = list1.listIterator();
        while(lit.hasNext())
        {
            System.out.print(lit.next() + " ");
        }
        
        
    }
}
