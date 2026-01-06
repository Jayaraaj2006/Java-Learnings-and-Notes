package Assignments.ExceptionHandling;

public class MultiException {
    public static void main(String[] args) {
        try {
            int a = 2;
            int div = a/0; // Arithmetic Error
            int[] num = {1,2,3};
            System.out.println(num[10]); // IndexOutOfBound Error
        }
        catch(ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("ArithmeticException or IndexOutOfBoundsException Occurs." + e);
        }
// "|" by using this symbol can able to declare multi exception in single catch block.

    }
}
