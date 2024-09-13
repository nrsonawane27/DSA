/*
   Given an integer array and another integer element . the task
   is to find if the given element is present in the array or not.
 */

package Array.Basic;

import java.util.Scanner;

public class SearchElement {

    public static int searchElement(int arr[], int key) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
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

        System.out.println("Element is found at index : " +searchElement(arr, 5));
    }
}
