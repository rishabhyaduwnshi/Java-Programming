import java.net.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        //Create an object of server-socket
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        BufferedReader br  = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do
        {
            msg = br.readLine();
            sb = new StringBuilder();
            sb.reverse();
            msg = sb.toString();
            ps.println(msg);
        }
        while(!msg.equals("dne"));
    }

}

class Client
{
    public void clientFunction() throws Exception
    {
        //Create an object of server-socket
        Socket stk = new Socket("localhost",2000);

        BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br  = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;
        do
        {
            msg = keyBoard.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("From server " + msg);
        }
        while(!msg.equals("dne"));
    }

}
