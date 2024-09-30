//27

package Array.Basic;

public class CountPairSum {

    public static  int countPair(int arr[], int arr2[], int target) {
        int N = arr.length;
        int M = arr2.length;
        int count = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(arr[i] + arr2[j] == target) {
                    System.out.println(arr[i] +" "+arr2[j]);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        int arr[] = new int[]{1, 3, 5, 7};
//        int arr2[] = new int[]{2, 3, 5, 8};
//        int target = 10;

        int arr[] = new int[]{1, 2, 3, 4};
        int arr2[] = new int[]{5, 6, 7, 8};
        int target = 5;

        System.out.println("Count of pair : "+ countPair(arr,arr2,target));

    }
}
