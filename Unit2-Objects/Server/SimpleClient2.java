package Server;

import java.net.*;
import java.io.*;
import java.util.*;

public class SimpleClient2 {
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleClient2(String ip, int port) throws Exception{
        socket=new Socket(ip, port);
        out=new PrintWriter(socket.getOutputStream(), true);
        in= new Scanner(socket.getInputStream());
    }
    public void sendMessage(String message){

        out.println(message);
        out.flush();
    }
    public String receiveMessage(){
        return in.nextLine();
    }
    public void close() throws Exception{
        socket.close();
        out.close();
        in.close();
    }
    public static void main(String[] args){
        SimpleClient2 simpleClient = new SimpleClient2("127.0.0.1",9090 );
        Scanner input = new Scanner(System.in);
        while(true){
            String message=input.nextLine();
            simpleClient.sendMessage(message);
            String serverR= simpleClient.receiveMessage();
            System.out.println("Server : "+serverR);
            if(serverR.equals("stop")){
                break;
            }
        }
        simpleClient.close();



    
}
