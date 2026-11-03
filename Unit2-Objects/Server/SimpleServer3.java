



import java.util.*;
import java.io.*;
import java.net.*;


public class SimpleServer3 {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleServer3(int port) throws Exception{
        serverSocket=new ServerSocket(port);

    }
    public void acceptClient()throws Exception {
        socket=serverSocket.accept();
        in=new Scanner(socket.getInputStream());
        out=new PrintWriter(socket.getOutputStream(), true);
    }
    public String receiveMessage(){
        return in.nextLine();

    }
    public void sendMessage(String msg){
        out.println(msg);
        out.flush();
    }
    public void close() throws Exception{
        serverSocket.close();
        socket.close();
        in.close();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        SimpleServer3 smp = new SimpleServer3(9090);
        smp.acceptClient();
        Scanner input=new Scanner(System.in);
        while(true){
            String message=input.nextLine();
            smp.sendMessage(message);
           // smp.sendMessage("hello");
            String msg=smp.receiveMessage();
            System.out.print("Client  "+msg);
            if(msg.equals("stop")){
                 break;
            }

        }
        smp.close();

    }

    
}
