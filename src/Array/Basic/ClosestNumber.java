package Array.Basic;

public class ClosestNumber {
    public static int closestNum(int arr[], int K) {
        int sum = Integer.MAX_VALUE;
        int N = arr.length;
        int closeNum = 0;

        for(int i = 0; i < N; i++) {
            int res = arr[i] - K;

            if(Math.abs(res) == sum) {
                if(closeNum < arr[i]) {
                    closeNum = arr[i];
                }
            }

            if(Math.abs(res) < sum) {
                sum = Math.abs(res);
                closeNum = arr[i];
            }
        }

        return closeNum;
    }
    public static void main(String[] args) {
//        int arr[] = {1, 3, 6, 7};
        int[] arr = {1, 2, 3, 5, 9};

        System.out.println("Closest number of K from array : " +closestNum(arr, 7));
    }
}
