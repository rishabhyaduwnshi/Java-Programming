import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        BitSet bs1 = new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);
        
        //shows only the bits that are set
        System.out.println(bs1);
        
        BitSet bs2 = new BitSet();
        bs2.set(0);
        bs2.set(2);
        bs2.set(4);
        bs2.set(6);
        bs2.set(8);
        bs2.set(1);
        bs2.set(3);
        bs2.set(5);
        bs2.set(7);
        bs2.set(9);
        
        bs1.and(bs2);
        System.out.println(bs1);
        
        
        bs1.or(bs2);
        System.out.println(bs1);
    }
}
