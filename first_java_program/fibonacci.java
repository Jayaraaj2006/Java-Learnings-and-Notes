package Assignments.first_java_program;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int f = 0;
        int s = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("how many times will fibonacci series continue:");
        int con = input.nextInt();

        for(int i =0;i <= con;i++){
            System.out.println(f);
            int t = f + s;
            f = s;
            s = t;

        }
    }
}
