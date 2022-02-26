import java.lang.*;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
       //First way
       int array1[][] = new int[2][2];
       
       //Second way
       int array2[][] = {{1,2},{3,4}};
      
       //Accessing 2D array2
       System.out.printf("Elements in array2 are : ");
       for(int i=0;i<array2.length;i++)
        for(int j=0;j<array2[0].length;j++)
            System.out.printf("%d ",array2[i][j]);
            
        System.out.println("");
        
        //Accessing 2D array2 using for each loop
       System.out.printf("Elements in array2 are : ");
       for(int x[]: array2)
        for(int y: x)
            System.out.printf("%d ",y);
    }
}
