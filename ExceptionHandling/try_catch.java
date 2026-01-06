package Assignments.ExceptionHandling;
import java.util.*;
public class try_catch {
    public static void main(String[] args) {
        try {             // -> try block is where the code is written which might get exception.
            int a = 1;
            int b = 0;
            int div = a / b;
        }
        catch(ArithmeticException e){    // -> catch block handles exception occurs in the try block.
            System.out.println("Zero Division Error !!!"+ e);
        }
        try{
           String s = null;
            System.out.println(s.length());

        }
        catch(NullPointerException e){
            System.out.println("NullPointerException Error !!!"+ e);
        }
        finally {   // -> this block is always executes whether the exception occured or not.
            System.out.println("Always Executes");
        }

    }
}
/* -> INTERNAL WORKING : If exception occurs in the try block,It will search for the suitable
 catch block that matches the same exception defined in the catch block.If it doesn't find any,
 it will throw an message or exception which is pre-defined exception.

  REFER GFG.

  CHECKED EXCEPTIONS(detect at compile time) ->  these exceptions are subclasses of Exception class.
  UNCHECKED EXCEPTIONS(detect at run time) -> these exceptions are subclasses of RunTimeException class.

   */