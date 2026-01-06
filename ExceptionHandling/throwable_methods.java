package Assignments.ExceptionHandling;

public class throwable_methods {
    public static void main(String[] args) {
        try{
            int a = 2;
            int div = a/0;
            System.out.println(div);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage()); // -> prints Only the message, not the exception type.
            System.out.println(e.toString());// -> prints Includes exception type + message.
            e.printStackTrace();// -> prints Shows where exactly the error occurred even more details like where the error is occured.
        }
    }
}