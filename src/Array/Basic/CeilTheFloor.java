//24
package Array.Basic;

import java.util.Scanner;

public class CeilTheFloor {

    public static void ceilFloor(int arr[], int X) {
        int N = arr.length;
        int floor = -1;
        int ceil = -1;

        for(int i = 0; i < N; i++) {
            if(arr[i] == X+1 || arr[i] == X) {
                ceil = arr[i];
            }
            if(arr[i] == X-1 || arr[i] == X) {
                floor = arr[i];
            }
            if(floor != -1 && ceil != -1) {
                System.out.println(floor +" "+ ceil);
                return;
            }
            if(floor != -1 && ceil == -1) {
                System.out.println(floor +" "+ ceil);
                return;
            }
            if(floor == -1 && ceil != -1) {
                System.out.println(floor +" "+ ceil);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("\nEnter the array element :");
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the X : ");
        int X = sc.nextInt();

        ceilFloor(arr, X);
    }
}
