package Assignments.first_java_program;

import java.util.Scanner;

public class name_greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = input.nextLine();
        System.out.print("best wishes"+" "+name);

    }
}
