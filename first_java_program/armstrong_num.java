package Assignments.first_java_program;

import java.util.Scanner;

public class armstrong_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the integer:");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        int r;
        while(num>0){
            r = num % 10;
            num = num / 10;
            sum = sum + r^3;
        }
        if(temp == sum){
           System.out.print("it is armstrong number");
       }else {
           System.out.print("it is not a armstrong number");
       }
    }



}
