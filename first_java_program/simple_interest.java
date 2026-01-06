package Assignments.first_java_program;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your Principal Amount:");
        int P = input.nextInt();
        System.out.print("enter your Rate of Interest(per year in %):");
        int R = input.nextInt();
        System.out.print("enter your Time Period(in years):");
        int T = input.nextInt();

        int SI = (P*R*T)/100;

        System.out.print("YOUR SIMPLE INTEREST(S.I):"+" "+SI);

    }
}
