package Array.Basic;

import java.util.Scanner;

public class MaxProduct {

    public static int maxProduct(int arr[]) {
        int large = Integer.MIN_VALUE;
        int secondLarge = large;
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            if(arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if(arr[i] != large & arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }

        System.out.println("Largest eleemnt from array : "+large);
        System.out.println("Second largest element from array : " +secondLarge);

        return large * secondLarge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size :");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println("length of array:"+arr.length);

        //to add the element in array
        for(int i=0;i<N;i++){
            System.out.print("Enter the element of array : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum product of two integer from array :  " +maxProduct(arr));
    }
}
