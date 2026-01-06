package Assignments.first_java_program;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first integer:");
        int int1 = input.nextInt();
        System.out.print("enter second integer:");
        int int2 = input.nextInt();
        System.out.print("enter the operator(add,sub,mul,div):");
        String operator = input.next();

        if(operator.equals("add")){
            System.out.print(int1 + int2);
        }else if(operator.equals("sub")){
            System.out.print(int1 - int2);
        }else if(operator.equals("mul")){
            System.out.print(int1 * int2);
        }else if(operator.equals("div")){
            if(int2 == 0){
                System.out.print("zero division error");
            }else{
                System.out.print(int1 / int2);
            }


        }else{
            System.out.print("invalid operator");
        }
    }
}
