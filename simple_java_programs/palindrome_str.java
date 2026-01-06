package Assignments.simple_java_programs;

import java.util.Scanner;

public class palindrome_str {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the string : ");
        String str = in.next();
        System.out.println(isPalindrome(str));


    }

    static Boolean isPalindrome(String a) {
        for (int i = 0; i <= a.length() / 2; i++) {
            char start = a.charAt(i);
            char end = a.charAt(a.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
