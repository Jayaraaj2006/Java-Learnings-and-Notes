package Assignments.ExceptionHandling;

public class nested_try_catch {
    public static void main(String[] args) {
        try  // outer block
        {
            System.out.println("OUTER BLOCK EXECUTES.");
            try  // Inner block 1
            {
                int a,b;
                a = 2;
                b = 0;
                System.out.println(a/b);
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException Occurs :" + e);
            }
            try  // Inner block 2
            {
                String s = null;
                System.out.println(s.length());
            }
            catch(NullPointerException e){
                System.out.println("NullPointerException Occurs :" + e);
        }
        }
        catch(Exception e){
            System.out.println("Exception Occurs in Outer Block :" + e);
        }
        finally {
            System.out.println("Finally Block Always Executes.");
        }
    }

}
