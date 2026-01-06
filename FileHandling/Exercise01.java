package Assignments.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercise01 {
    public static void main(String[] args) {
        try {
            // lets read file data using BufferedReader and write using BufferedWriter.
            BufferedReader br1 = new BufferedReader(new FileReader("inEX.txt"));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter("outEX.txt"));
            String a ;
            while ((a = br1.readLine()) != null){
                bw1.write(a);
            }
            br1.close();
            bw1.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
