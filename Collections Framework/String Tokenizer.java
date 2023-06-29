import java.lang.*;
import java.util.*;

class Main
{
    public static void main(String args[])
    {
        String str = "name=Rishabh;job=Developer;address=Bengaluru";
        StringTokenizer stk = new StringTokenizer(str,"=;");
        
        String tokens;
        while(stk.hasMoreTokens())
        {
            tokens = stk.nextToken();
            System.out.println(tokens);
        }
    }
}
