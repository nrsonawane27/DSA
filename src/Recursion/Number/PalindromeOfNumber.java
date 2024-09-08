package Recursion.Number;

import java.util.Scanner;

public class PalindromeOfNumber {

    static int newNum = 0;
    static void palin(int num) {
        if(num == 0) return;

        newNum = newNum * 10 +  num % 10;
        palin(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();

        palin(n);
        System.out.println(newNum);
        if(newNum == n) {
            System.out.println("number is palindrome ");
        } else {
            System.out.println("number is not a palindrome");
        }

    }
}
