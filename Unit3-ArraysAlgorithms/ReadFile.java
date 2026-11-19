import java.io.*;
import java.util.*;

public class ReadFile {
    String[] students;
    int[] days;
    public ReadFile(String fname) throws FileNotFoundException{
        File f= new File(fname);
        Scanner input= new Scanner(f);
        int index=0;
        while(input.hasNextLine()){
            String line=input.nextLine();
            int space=line.indexOf(" ");
            students[index]=line.substring(0, space);
            days[index]=Integer.parseInt(line.substring(space+1));
            index++;

        }
        input.close();

    }
    //TODO find youngest
    //TODO find oldest
    //TODO find average
    //TODO find duplicates


    public static void main(String[] args) {
        try{
        ReadFile r= new ReadFile("names.txt");
        }catch(FileNotFoundException e){

        }
        
    }
    
}
