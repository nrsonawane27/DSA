package Array;

import java.util.Scanner;

public class SubArrayUsingKadanesAlgo {

    //Implementation of Kadanes algorithm to find the max sum of subarray
    public static void kadanes(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0; i<number.length; i++){
            currSum = currSum + number[i];

            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Max subarray sum is:"+maxSum);
    }

    public static void main(String args[]){
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

        //max sum of subarray using kadanes algorithm
        System.out.println("\nsubarray of array\n");
        kadanes(arr);
    }
}