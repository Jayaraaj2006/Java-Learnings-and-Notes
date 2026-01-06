package Assignments.FileHandling;

import java.io.FileReader;
import java.io.IOException;
// FileReader is the subclass of InputStreamReader Class which is used to read characters from the file.
// If want to read byte values from the file,consider FileInputStream from InputStream Class.
public class fileReader {
    public static void main(String[] args) {
        try {
            FileReader io = new FileReader("details.txt");
            int dem = io.read();
            while(io.ready()){
                System.out.println((char)dem);
                dem = io.read();
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
