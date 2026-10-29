package Server;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient{
     private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleClient(String ip, int port)throws Exception{
        socket=new Socket(ip, port);
    }

}
