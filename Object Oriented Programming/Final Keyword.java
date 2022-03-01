import java.lang.*;
import java.util.*;

//final keyword is similar to const keyword in c and c++
class finalKeyword
{
    //varibales declared with final keyword should be written in uppercase
    final int MIN = 1;
    final int MAX;
    final int NORMAL;
    
    //final keyword variables can also be initilised inside constructor and every constructor
    void finalKeyword()
    {
        NORMAL = 50;
    }
    
    //final keyword variables can also be initilised inside static blocks
    static
    {
        MAX = 100;
    }s
    
}



class Main
{
    public static void main(String args[])
    {
        finalKeyword f1 = new finalKeyword();
    }
}
