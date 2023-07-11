import java.lang.*;
import java.util.*;
import java.io.*;
import java.net.*;

public class Main
{
    public static void server() throws Exception
    {
	System.out.println("Server started");
	
        //Create a server object using ServerSocket class 
        ServerSocket ss = new ServerSocket(2000);
        
        //accept the connect from client
        Socket stk = ss.accept();
        
        //Streams for getting input from client
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        
        //PrintStream for sending data back to client
        PrintStream ps = new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        
        do
        {
            //reads the line socket sent
            msg = br.readLine();
            System.out.println("Server reversed " + msg);

            //reverse the line
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
	
            //for sending the data to client
            ps.println(msg);
        }
        while(!msg.equals("dne"));
    }
    
    public static void main(String args[]) throws Exception
    {
        //calling server
        server();
    }
}
