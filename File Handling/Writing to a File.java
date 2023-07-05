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
            
            //1st Method
            String str1 = "Learning Java Programming\n";
            fos.write(str1.getBytes());
            
            //2nd Method - Writing byte by byte
            String str2 = "Writing each byte at a time\n";
            byte b1[] = str2.getBytes();
            for(byte x : b1)
                fos.write(x);
            
            //3rd Method - Using offset
            String str3 = "Copy only some part of string\n";
            byte b2[] = str3.getBytes();
            
            fos.write(b2,6,str3.length()-6);
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
