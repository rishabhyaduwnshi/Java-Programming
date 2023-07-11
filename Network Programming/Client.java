import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;

class Main
{
    public static void main(String args[]) throws Exception
    {
        //Create a client object using Socket class and mention the & portnumber to which it has to connect
        Socket stk = new Socket("localhost", 2000);
        
        //Give input from keyboard
        BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));
        
        //Streams for getting input from server
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        
        //PrintStream for sending data back to client
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        
        do
        {
            //reads the line socket sent
            msg = keyBoard.readLine();
            
            //for sending the data to client
            ps.println(msg);
            
            //print the message received from server
            msg = br.readLine();
            System.out.println("From server : "+msg);
        }
        while(!msg.equals("dne"));
    }
}
