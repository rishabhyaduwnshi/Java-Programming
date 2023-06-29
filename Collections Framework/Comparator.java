import java.lang.*;
import java.util.*;


class My implements Comparator<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        if(i1 > i2)
            return -1;
        else if(i2 > i1)
            return 1;
        return 0;
    }
}

class Main
{
    public static void main(String args[])
    {
        int array1[] = {1,2,3,4,5};
        int array2[] = {1,2,3,4,6};
        
        //comparision is done element by element, since array1 is smaller, so output is -1
        System.out.println(Arrays.compare(array1,array2));
        
        Integer Array3[] = {1,5,3,6,8,2};
        Arrays.sort(Array3, new My());
        
        for (int x: Array3)
            System.out.print(x + " ");
        
        
        
    }
}
