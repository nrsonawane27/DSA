/*
    given an array A of size N of integers .Your task is to find the minimum
    and maximum elements in the array.
 */

package Array.Basic;

import java.util.Scanner;

public class MinMaxElement {

    public static void element(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } else if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max element of array is : " +max);
        System.out.println("Min element of array is : " +min);
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Element of array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        element(arr);
    }
}
