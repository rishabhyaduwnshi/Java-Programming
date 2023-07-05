import java.lang.*;
import java.util.*;
import java.io.*;

class Main
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("TextFile.txt");
            String str = "Learning Java Programming";
            fos.write(str.getBytes());
            fos.close();
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
