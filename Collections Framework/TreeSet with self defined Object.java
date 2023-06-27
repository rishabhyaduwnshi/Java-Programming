import java.lang.*;
import java.util.*;


//creating custom class for storing in TreeSet
class Point implements Comparable
{
    int x;
    int y;
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    //must override toString method
    public String toString()
    {
        return "x = "+x +" y = " +y;
    }
    
    //must override comapareTo method, datatype will be object but it has to typecasted accordingly
    public int compareTo(Object O) 
    {
        Point p = (Point)O;
        if(this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else
        {
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}

class Main
{
    public static void main(String args[])
    {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        
        System.out.println(ts);
    }
}
