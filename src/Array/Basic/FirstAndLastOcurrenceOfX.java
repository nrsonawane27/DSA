/*
    Given a sorted array having N elements, find the indices of the first and last occurrences of an element X in the given array.
    Note: If the number X is not found in the array, return '-1' as an array.
    Example 1:
    Input:
    N = 4, X = 3 arr[] = { 1, 3, 3, 4}
    Output: 1  2
    Explanation: For the above array, first occurance of X = 3 is at index = 1 and last occurrence is at index = 2.
    Example 2:
    Input:
    N = 4, X = 5 arr[] = {1, 2, 3, 4}
    Output:
    -1
 */

package Array.Basic;

import java.util.Scanner;

public class FirstAndLastOcurrenceOfX {
    public static void findocurrence(int arr[], int X) {
        int count = 0;
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == X) {
                count++;
                if(count == 1) {
                    System.out.println(i);
                }
                lastIndex  = i;
            }

        }
        System.out.println(lastIndex);
//        if(count >= 1) {
//            System.out.println(count);
//        } else {
//            System.out.println(-1);
//        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array : ");
        int N = sc.nextInt();

        System.out.print("Enter the element which index to be find : ");
        int X = sc.nextInt();

        int arr[] = new int[N];
        for( int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        findocurrence(arr, X);
    }
}
