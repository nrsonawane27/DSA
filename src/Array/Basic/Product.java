/*
    Given two arrays of A and B respectively of sizes N1 and N2, the task is to calculate
     the product of the maximum element of the first array and minimum element of the second array.
    Example 1:
    Input: A[]= \{5, 7, 9, 3, 6, 2\} , B[]= \{1, 2, 6, - 1, 0, 9\}
    Output: -9
    Explanation:
    The first array is 5 7 9 3 6 2.
    The max element among these elements is 9.
    The second array is 126-109.
    The min element among these elements is -1.
    The product of 9 and -1 is 9^ * - 1 = - 9

    Example 2:
    Input: A[]= \{0, 0, 0, 0\} B[]= \{1, - 1, 2\}
    Output: 0
 */

package Array.Basic;

import java.util.Scanner;

public class Product {
    public static int productOfMaxMinElementFromDifferentArray(int arr1[], int arr2[]) {
        int large = Integer.MIN_VALUE;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] > large) {
                large = arr1[i];
            }
        }

        int small = Integer.MAX_VALUE;
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] < small) {
                small = arr2[i];
            }
        }

        return large * small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array 1 : ");
        int N = sc.nextInt();
        int arr1[] = new int[N];
        System.out.println(("Enter the element of array "));
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Size of array 2 : ");
        int M = sc.nextInt();
        int arr2[] = new int[M];
        System.out.println(("Enter the element of array "));
        for(int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(productOfMaxMinElementFromDifferentArray(arr1, arr2));
    }
}
