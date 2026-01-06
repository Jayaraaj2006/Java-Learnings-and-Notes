package Assignments.FileHandling;

import java.io.*;

public class Exercise0 {
    public static void main(String[] args) {
        try {
            // lets read file data using BufferedReader and write using BufferedWriter.
            BufferedReader br1 = new BufferedReader(new FileReader("inEX.txt"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("outEX.txt"));
            int a ;
            while ((a = br1.read()) != -1){
                bw1.write(a);
            }
            br1.close();
            bw1.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
