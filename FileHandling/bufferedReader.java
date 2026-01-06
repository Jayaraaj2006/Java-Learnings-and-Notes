package Assignments.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* BufferedReader Class is one of the Subclasses of Reader Class.Reads text from a character-input stream.
It's mainly for fast reading purpose.
Constructor -> BufferedReader(Reader in),use argument as Reader Object(it may be any subclasses of Reader Class).
 */

public class bufferedReader {
    public static void main(String[] args) {
        // Example 1:By using InputStreamReader Class as a Argument.
//        try {
//            InputStreamReader is = new InputStreamReader(System.in);
//            BufferedReader br = new BufferedReader(is);
//            System.out.println("You Typed :" + br.readLine());
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }

        //Example 2:By using FileReader Class as a Argument.
        try{
            BufferedReader br = new BufferedReader(new FileReader("details.txt"));
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
