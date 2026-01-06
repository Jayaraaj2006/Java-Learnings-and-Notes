package Assignments.first_java_program;

import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("the given number is even");
        }else{
            System.out.println("the given number is odd");
        }

    }
}
