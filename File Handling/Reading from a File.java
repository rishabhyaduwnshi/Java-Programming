import java.lang.*;
import java.util.*;
import java.io.*;

class Main
{
    public static void main(String args[])
    {
        try
        {
            //Reading the file at once
            FileInputStream fis = new FileInputStream("TextFile.txt"); //Instead of FileInputStream we can also use FileReader for char and the methods are same
            byte b[] = new byte[fis.available()]; 
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            fis.close();
            
            
            //Reading byte by byte
            FileInputStream fis1 = new FileInputStream("TextFile.txt");
            int x;
            do
            {
                x = fis1.read();
                
                if(x != -1) //for avoiding prinitng the box
                    System.out.print((char)x);
            }
            while(x != -1);
            
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
