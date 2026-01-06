package Assignments.FileHandling;
import java.util.*;
import java.io.*;

/*read and write in files using Byte stream.All the ByteStreams classes are subclasses of InputStream and
OutputStreams.FileInputStream and FileOutputStream are one of the SubClasses of InputStream and
OutputStream.(ByteStreams read and writes one byte at a time.)      */

public class read_write {
    public static void main(String[] args)throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;


        try {
            in = new FileInputStream("details.txt");
            out = new FileOutputStream("outdetails.txt");
            int a;

            while(( a = in.read()) != -1){
                out.write(a);
            }
        }
        finally {
            if(in != null){
                in.close();
            }
            if(out != null){
                out.close();
            }

        }



    }
}
