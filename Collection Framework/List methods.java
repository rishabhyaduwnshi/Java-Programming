import java.lang.*;
import java.util.*; 

//interface List extends Collection
//interface Set extends Collection - set dosen't have any extra methods other than what are present in Collection interface

class Main
{
    public static void main (String[] args) 
    {
        add(int Index, E e); //inserts an element at a given index
        addAll(int index, Collection<E> e); //inserts a Collection starting from the given index
        remove(int index); //remove an element from a given index
        
        get(int Index); //returns the element present at given Index
        set(int Index, E e); //changes the elements present at the given Index
        
        subList(int from, int to); //to grab a small list from a big list with index from and to
        indexOf(Object a); //returns the index of given Object
        lastIndexOf(Object a); //returns the last index at which object is present
        
        listIterator();
        listIterator(int index);
    }
    
}
