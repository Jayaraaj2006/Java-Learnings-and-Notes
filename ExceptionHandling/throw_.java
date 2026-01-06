package Assignments.ExceptionHandling;

public class throw_ {
    public static void CheckAge(int age){
        if (age < 18){
            System.out.println("Age is Not up to the mark,Access Declined.");
            throw new RuntimeException();
        }
        else{
            System.out.println("Access Granted.");
        }
    }

    public static void main(String[] args) {
       CheckAge(13);

    }
}
/* throw keyword in ExceptionHandling is used to Explicitly throw an Exception.    */