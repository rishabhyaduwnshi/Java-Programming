import java.lang.*;
import java.util.*; 

//Methods of ArrayList

class Main
{
    public static void main (String[] args) 
    {
        //creating an ArrayList
        LinkedList<Integer> aL1 = new LinkedList<>();
        
        //adding 3 elements to ArrayList
        aL1.add(10);
        aL1.add(20);
        aL1.add(10);
        aL1.add(30);
        //current list is 10,20,30
        System.out.println(aL1);
        
        //adding 5 at index 0
        aL1.add(0,5);
        //current list is 5,10,20,30
        System.out.println(aL1);
        
        //adding at in front position
        aL1.addFirst(100); //similary we have removeFirst();
        System.out.println(aL1);
        
        System.out.println("");
        
        //adding at in last position
        aL1.addLast(200);//similary we have removeLast();
        System.out.println(aL1);
        
        //creating a new ArrayList aL2
        LinkedList aL2 = new LinkedList<>();
        aL2.add(40);
        aL2.add(50);
        aL2.add(60);
        
        //adding the entire ArrayList aL2 to aL1
        aL1.addAll(aL2);
        //current list is 5,10,20,30,40,50,60
        System.out.println(aL1);
        
        //checking if an element in present
        System.out.println(aL1.contains(5)); //true
        System.out.println(aL1.contains(15)); //false
        
        //getting an element from an index
        System.out.println("Element present at index 5 is "+aL1.get(5));
        
        //getting the index of an Element
        System.out.println("index of 40 is "+aL1.indexOf(40));
        System.out.println("last index of 10 is "+aL1.lastIndexOf(10));
        
        //Iterating through a ArrayList
        for(int i=0;i<aL1.size();i++)
            System.out.print(aL1.get(i) + " ");
        
        System.out.println("");
        
        //Using for each loop
        for(Integer x: aL1)
            System.out.print(x + " ");       
            
        System.out.println("");
        
        //Using an iterator
        for(Iterator<Integer> it1 = aL1.iterator(); it1.hasNext();)
        {
            Integer x = it1.next();
            System.out.print(x + " ");
        }
        
        System.out.println("");
        
        Iterator it2 = aL2.iterator();
        while(it2.hasNext())
        System.out.print(it2.next() + " ");
    }
    
}
