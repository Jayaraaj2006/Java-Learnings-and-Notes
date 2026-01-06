package Assignments.FileHandling;


import java.io.FileWriter;
import java.io.IOException;

// FileWriter is a Subclass of OutputStreamWriter.It is used to write in a file.
public class fileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("outdetails.txt",true);
            fw.write("I'm Jayaraaj");/*if i clear this data and adds new data then runs,new data is overloaded.
            If not wanted to be Overloaded,use ,true in the argument section during object creation.       */
//            fw.write("dhbcf"); // in this line,it is appended.
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
