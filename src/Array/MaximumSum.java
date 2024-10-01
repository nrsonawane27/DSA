/*
    Print the subarray that have maximum sum
    Given an integer array of size N
    find the contiguous subarray (containing atleast one number)
    which has the largest sum and return
    Input :
    [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    Output :
    [4, -1, 2, 1]
 */

package Array;

public class MaximumSum {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;

        int maxsum = Integer.MIN_VALUE;

        int X = -1;
        int startIdx = -1;
        int endIdx = -1;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
//            if(sum < 0) {
//                X = i+1;
//            }

            if(sum > maxsum) {
                maxsum = sum;
                startIdx = X;
                endIdx = i;
            }
            if(sum < 0) {
                X = i + 1;
                sum = 0;
            }
        }

        System.out.println(startIdx);
        System.out.println(endIdx);

        for(int i = startIdx; i <= endIdx; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
