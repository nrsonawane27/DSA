//32

package Array.Basic;

public class MaximizeSumOfArray {

    public static int maximizeSum(int arr[]) {
        int N = arr.length;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int maxMul = 0;
         for(int i = 0; i < N; i++) {
             maxMul += i * arr[i];
         }

         return maxMul;
    }

    public static void main(String[] args) {
//        int arr[] = new int[]{5, 3, 2, 4, 1};

        int arr[] = new int[]{1, 2, 3};

        System.out.println("Maximum multiplication is : " +maximizeSum(arr));
    }
}
