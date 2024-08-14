package Array;

import java.util.Scanner;

public class SubArray {

    //Method for Subarray
    public static void sub(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print( +number[k]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the array size :");
        n = sc.nextInt();
        int number[] = new int[n];

        System.out.println("length of array:"+number.length);

        for(int i=0;i<number.length;i++){
            System.out.print("Enter the array elements =");
            number[i] = sc.nextInt();
        }

        //subarray of array
        System.out.println("\nsubarrays of array\n");
        sub(number);


    }
}
