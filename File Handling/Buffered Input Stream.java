import java.lang.*;
import java.util.*;
import java.io.*;


class Main
{
    public static void main (String[] args)
    {
        try
        {
            FileInputStream fis = new FileInputStream("TextFile.txt"); //FileReader
            BufferedInputStream bis =  new BufferedInputStream(fis); //BufferedReader
            
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            
            bis.mark(10);
            
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
            
            bis.reset();
            
            System.out.print((char)bis.read());
            System.out.print((char)bis.read());
        }
        
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        
        catch (IOException e)
        {
            System.out.println(e);
        }
        
    }
}
