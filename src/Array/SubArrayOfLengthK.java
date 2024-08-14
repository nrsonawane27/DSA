/*
    Program for Count of subarrays of array of length k, print the all subarrys
    having length k and print the sum of subarray having max sum
 */
package Array;

public class SubArrayOfLengthK {


    public static void main(String[] args) {
        int []arr = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};

        int k = 4;

        //total subarray of length k
        System.out.println("count of subarrays : " +(arr.length-k+1));

        //print the subarray of length k and find the max sum of subarray
        System.out.println();
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<= arr.length-k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
                sum += arr[j];
            }
            System.out.println(" : " + sum);
            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        System.out.println("Maximum sum subarray of length k : " +maxSum);

    }
}