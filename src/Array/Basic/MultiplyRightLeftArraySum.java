//33
package Array.Basic;

public class MultiplyRightLeftArraySum {

    public static int multiply(int arr[]) {
        int N = arr.length;
        int mid = N / 2;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < N; i++) {
            if(i < mid) {
                leftSum += arr[i];
            }
            else {
                rightSum += arr[i];
            }
        }
        int mul = leftSum * rightSum;

        return mul;
    }
    public static void main(String[] args) {
//        int arr[] = new int[]{1, 2, 3, 4};

        int arr[] = new int[]{1, 2};


        System.out.println( multiply(arr));
    }
}
