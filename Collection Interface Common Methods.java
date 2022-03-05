import java.lang.*;
import java.util.*; //Collection framework class are present in util package

//Collection classes and interfaces are generic, they support object of any class
class Main
{
    public static void main (String[] args) 
    {
        add(object a); //for adding a single object
        addAll(Collection<E> e); //for adding a Collection
        remove(object a); //for removing a single object
        removeAll(Collection<E> e); //for removing an entire Collection
        
        retainAll(Collection<E> e); //keeps the elements of e and delets rest, opposite of removeAll
        clear(); // deletes all the object will be deleted from Collection
        isEmpty(); // returns true or false depending if Collection is empty or not
        
        contains(object a); //for searching an Object
        containesAll(Collection<E> e); //for searching an entire Collection
        equals(); //for comapring Collections
        
        size(); //returns the size
        interator(); //for traversing the Collection
        
        
    }
}
