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
            //int start=i;
            for(int j=i;j<number.length;j++){
                //int end=j
//                System.out.println("(");

                currSum = i/*start */ == 0 ? prefix[j/*end */] : prefix[ j /*end */]-prefix[i-1];

//                System.out.print("the sum of subarray is:"+currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
//                System.out.println(")");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The maximum sum is:"+maxSum);

    }
    public static void main(String args[]){
        int arr[] = {7,8,9,3,5,3,2,8};
        //subarray of array
        System.out.println("\nsubarray of array\n");
        sub(arr);


    }
}