import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
       //Every array in java is created in heap 
       //First way of creating array
       int A[] = new int[5]; //int[5] is the object that is created in heap and A[] holds its refrence
       
       //Second way
       int B[] = {1,2,3,4,5};
       
       //Third way
       int C[];
       C = new int[10];
       
       //printing the size of array
       System.out.printf("Size of array c is %d", C.length);
       System.out.println("");
       
       //printing the values of array using for each loop
       System.out.println("Elements of array B are : ");
       for(int x: B)
       System.out.printf("%d ", x);
       
       
    }
}
