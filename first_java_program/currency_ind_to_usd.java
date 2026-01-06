package Assignments.first_java_program;

import java.util.Scanner;

public class currency_ind_to_usd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter INR value:");
        float INR = input.nextFloat();

        float USD = 0.012f*INR;

        System.out.print("USD value is "+USD);
    }
}
