

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.io.*;
import java.net.*;

public class SimpleServer2 {
    private ServerSocket serverSocket;
    private Socket socket;
    private Scanner in;
    private PrintWriter out;

    public SimpleServer2(int port) throws Exception{
        serverSocket=new ServerSocket(port);
    }
    public void acceptClient() throws Exception{
        socket=serverSocket.accept();
        in= new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream(), true);
    }
    public String receiveMessage(){
        return in.nextLine();
    }
    public void sendMessage(String msg){
        out.println(msg);
        out.flush();
    }
    public void close() throws Exception{
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        try { 
        SimpleServer2 server=new SimpleServer2(9090);
        server.acceptClient();
        while(true){
           String message=input.nextLine();
           server.sendMessage(message);
           String response=server.receiveMessage();
           System.out.println("Client:  "+response);
           if(response.equals("stop")){
            break;
           }
        } //try ends
        server.close();
        }catch(Exception e){
        }//catch ends
    } //main ends
    
}
