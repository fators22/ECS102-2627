import java.io.*;
import java.util.Scanner;
public class FileRead {


    public FileRead(String filename)throws Exception{
        File f= new File(filename);
        Scanner s= new Scanner(f);
        int total=0;
        String user="";
        int countdays=0;
        while(s.hasNextLine()){
            String line=s.nextLine();
            String[] tokens=line.split(",");
            if( user.equals("") || !user.equals(tokens[0]) ){
                System.out.println(user+ "   slept "+total+ "min  avg "+total*1.0/countdays/60+ "hours");
                user=tokens[0];
                total=0;
                countdays=0;
                countdays++;
                total=total+Integer.parseInt(tokens[2]);
            }else if (user.equals(tokens[0])){
                total=total+Integer.parseInt(tokens[2]);
                countdays++;
            }
            
            //0 and 2

        }

    }
    public static void main(String[] args) throws Exception {
        FileRead file= new FileRead("sleep.csv");
    }
    
}
