package Assignments.FileHandling;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

// Constructor -> OutputStreamWriter(OutputStream out),Argument as OutputStream obj.

public class outputStreamWriter {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(System.out);/* (System.out) which is the type of
        PrintStream.PrintStream is one of the Subclasses of OutputStream(ByteStream).so we can use this.       */
            osw.write(12);
            osw.write("what");
            osw.write('r');
            char[] arr = {'a', 'd'};
            osw.write(arr);
            String name = "Jayaraaj";
            osw.write(name);
            osw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
