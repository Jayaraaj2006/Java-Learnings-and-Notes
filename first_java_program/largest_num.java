package Assignments.first_java_program;

import java.util.Scanner;

public class largest_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number:");
        float num1 = input.nextFloat();
        System.out.print("enter second number:");
        float num2 = input.nextFloat();

        if(num1 > num2){
            System.out.print(num1+ " "+"is largest number");
        }else{
            System.out.print(num2+" "+"is largest number");
        }
    }
}
