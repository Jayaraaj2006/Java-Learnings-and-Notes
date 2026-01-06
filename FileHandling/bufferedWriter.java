package Assignments.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

// Constructor ->         BufferedWriter(Writer out)
public class bufferedWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("outdetails.txt"));
            bw.write("i'm jayaraaj");
            bw.write(24);
            bw.newLine();// Writes a line separator.
            bw.write("i'm kaviraaj");

            bw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
