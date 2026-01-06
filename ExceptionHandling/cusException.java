package Assignments.ExceptionHandling;

import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String message){
        super(message);
        // Extending Exception class,so it becomes checked exception and calling the parent class's
        // constructor using super
    }
}
public class cusException{
    public void checkAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("Access Denied !!!");
        }
        else{
            System.out.println("Access Granted");
        }
    }
}
class error{
    public static void main(String[] args) {
        cusException obj = new cusException();
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter your Age :");
            int age = in.nextInt();
            obj.checkAge(age);
        }
        catch(AgeException e){
            System.out.println(e);
        }
    }
}
