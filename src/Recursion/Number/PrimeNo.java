package Recursion.Number;

import java.util.Scanner;

public class PrimeNo {

    static int div = 1;
    static int count = 0;
    static void prime(int num, int temp) {
        if(temp >= num/2 ){
//            System.out.println("number is a prime number");
            return;
        }

        if(num % temp == 0) {
            temp++;
        }
        prime(num, temp+1);
        if(temp == 2) {
            System.out.println("number is a prime number");
        } else {
            System.out.println("number is not a prime number");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        prime(n, 2);

    }
}
