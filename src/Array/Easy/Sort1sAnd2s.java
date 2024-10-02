package Array.Easy;

public class Sort1sAnd2s {

    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
//        int arr[] = new int[]{0, 2, 1, 2, 0};

        int arr[] = new int[]{0, 1, 0, 2, 2, 0, 0, 1, 0, 2, 1};

        int N = arr.length;
        sortArray(arr);

        for(int i = 0; i < N; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
