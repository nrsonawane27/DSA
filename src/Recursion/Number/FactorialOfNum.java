package Recursion.Number;

import java.util.Scanner;

public class FactorialOfNum {

    static int  factorial(int num) {
        if(num == 1) {
            return 1;
        }

        return num * factorial(num-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("sum of n numbers : " +factorial(n));
    }
}
