/*
     max sum of sub array having length k using sliding window algorithm
 */

package Array;

public class SlidingWindow {
    public static void main(String[] args) {
        int []arr = new int[]{-3, 4, -2, 5, 3, -2, 8, 2, 1, 4};

        //length of subarray
        int k = 4;

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        //sliding window concept
        int maxSum = sum;
        for( int i = 1; i <= arr.length-k; i++) {
            sum = sum - arr[i-1] + arr[i+k-1];

            if(sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}


/*
     time complexity = O(n) -------linear complexity
     space complexity = O(1) -------constant complexity
 */