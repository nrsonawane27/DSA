package Array.Basic;

import java.util.Scanner;

public class SecondSmallest {

    public static void findSecondSmallest(int arr[]) {
        int small = Integer.MAX_VALUE;
        int secondSmall = small;
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            if(arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if(arr[i] != small & arr[i] < secondSmall) {
                secondSmall = arr[i];
            }
        }

        System.out.println("Smallest eleemnt from array : "+small);
        System.out.println("Second smallest element from array : " +secondSmall);
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

        findSecondSmallest(arr);
    }
}
