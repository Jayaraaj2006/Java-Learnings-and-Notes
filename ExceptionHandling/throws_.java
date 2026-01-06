package Assignments.ExceptionHandling;

public class throws_ {
    static void div() throws ArithmeticException  /* throws is used to indicate a particular method that
    might throw an exception,and the exception is handled by the method caller.If i try to call
    the method like this div(),the error will occur.because compiler know that the method might
    have exception as we indicated the exception in the method.
    */
    {
        int a = 2;
        System.out.println(a/0);
    }

    public static void main(String[] args) {
        try{
            div();          // the exception is handled in method caller side.
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
