/*
     Given an array arr[] containing positive elements. A and B are two numbers defining a
     range. The task is to check if the array contains all elements in the given range.
    Example 1:
    Input: N = 7 A = 2 B = 5
    arr[] = \{1, 4, 5, 2, 7, 8, 3\}
    Output: Yes
    Explanation: It has elements between range 2-5 i.e 2,3,4,5
 */
package Array.Basic;

import java.util.Scanner;

public class ElementInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int N = sc.nextInt();

        System.out.print("Enter the starting range (A) : ");
        int A = sc.nextInt();

        System.out.print("Enter the ending range (B) : ");
        int B = sc.nextInt();

        int arr[] = new int[N];

        System.out.println("Enter the array element");
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int j = A; j <= B; j++) {
            boolean flag = false;
            for(int i = 0; i < N; i++) {
                if(j == arr[i]) {
                    flag = true;
                }
            }
            if(flag == false) {
                System.out.println("NO");;
                return;
            }
        }
        System.out.println("YES");

    }
}
