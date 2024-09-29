//20
package Array.Basic;

public class GivenSumExist {

    public static boolean find(int arr[], int target) {
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int arr[] = {0, -1, 2, -3, 1};
//        int target = -2;

        int arr[] = {1, -2, 1, 0, 5};
        int target = 4;

        if(find(arr, target) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
