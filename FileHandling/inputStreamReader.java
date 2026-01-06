package Assignments.FileHandling;

import java.io.IOException;
import java.io.InputStreamReader; /* InputStreamReader,It reads bytes and decodes them into characters.
  Construtor -> InputStreamReader(InputStream in) takes argument as InputStream Object which is byte data.    */

public class inputStreamReader {
    public static void main(String[] args) {
        try{
            InputStreamReader ir = new InputStreamReader(System.in);/*(in) is a reference variable of Input
            Stream Class.Meaning of "System.in"we're taking input from the keyboard which is byte data and
              in this program,that's why we type cast them as char.*/
            int let = ir.read();

            while(ir.ready()){
                System.out.println((char)let);
                let = ir.read(); // JUST READING USING InputStreamReader Class.
            }

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
/* QUICK TIP:
-> classes which names ends with Stream is a subclasses of Input and OutStream Class(ByteStream).
-> classes which names ends with Reader or Writer are the subclasses of Reader or Writer Class(CharacterStream).
 */
