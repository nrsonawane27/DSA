/*
  find the maximum sum of subarray using prefix sum
 */
package Array;

public class SubArrayUsingPrefixSum {

    public static void sub(int number[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        int prefix[]=new int [number.length];

        prefix[0]=number[0];
        //calculate prefix array
        for (int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }

        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){

                currSum = i== 0 ? prefix[j] : prefix[j]-prefix[i-1];

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("The maximum sum is:"+maxSum);

    }

    public static void main(String args[]){
        int arr[] = {7,8,9,3,5,3,2,8};

        //maximum sum of subarray of given array
        System.out.println("\nsubarray of array\n");
        sub(arr);


    }
}