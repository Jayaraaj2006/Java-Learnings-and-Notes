package Assignments.ExceptionHandling;

public class Exception_1 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);  // Goes to catch and program executes and never goes to next line in try -> ArrayIndexOutOfBoundsException
            int result = 10 / 0;              // ArithmeticException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist.");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        catch (Exception e) {
            System.out.println("Something else went wrong.");
        }
    }
}