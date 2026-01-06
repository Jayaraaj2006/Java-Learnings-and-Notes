package Assignments.simple_java_programs;

import java.util.Scanner;

public class simple_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //area of the circle program
/*
        System.out.print("enter the radius of the circle : ");
        double radius = in.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.print("the area of the circle : "+area);*/

        // area of triangle program
/*
        System.out.print("enter the base of the triangle : ");
        double base = in.nextDouble();
        System.out.print("enter the height of the triangle : ");
        double height = in.nextDouble();
        double area =(base * height)/2;
        System.out.print("the area of the triangle : "+area); */

        // curved surface area of the cylinder
/*
        System.out.print("enter the height");
        double height = in.nextDouble();
        System.out.print("enter the radius");
        double radius = in.nextDouble();
        double area = 2 * height * radius * Math.PI;
        System.out.print("the curved area of cylinder "+area ); */

        //  find factors of the given n numbers
/*
        System.out.print("enter n ");
        int n = in.nextInt();
        for (int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }  */
        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        /*
        int sum = 0;
        System.out.print("enter the numbers(press 0 to stop) : ");
        while(true){// infinite loop
            int n = in.nextInt();
            if (n == 0){
                break;
            }
            sum += n;
        }
        System.out.print("sum of the following number is " +sum);
         */
        // Take integer inputs till the user enters 0 and print the largest number from all.

        int large = 0;
        System.out.print("enter the numbers(press 0 to stop) : ");
        while(true){
            int n = in.nextInt();
            if(n == 0){
                break;
            }
            if (n > large){
                large = n;
            }
        }
        System.out.print("the largest number in the series is "+large);














    }
}
