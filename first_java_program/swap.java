package Assignments.first_java_program;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a ");
        int a = in.nextInt();
        System.out.print("enter b ");
        int b = in.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.print(b);
    }
}

