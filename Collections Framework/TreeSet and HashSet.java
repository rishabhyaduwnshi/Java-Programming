import java.lang.*;
import java.util.*;


class Main
{
    public static void main(String args[])
    {  
        //hashset is also same as tree set, almost similar functions
        TreeMap <Integer,String> tm = new TreeMap<>(Map.of(0,"A",1,"B",3,"C"));
        tm.put(4,"D");
        
        
        System.out.println(tm.ceilingEntry(4).getValue());
        System.out.print(tm);
        
    }
}
