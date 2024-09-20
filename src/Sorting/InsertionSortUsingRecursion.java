package Sorting;

public class InsertionSortUsingRecursion {

    public static void insertionSort(int arr[], int i) {

        if( i == arr.length)
            return;
        int element = arr[i];
        int j = i-1;

        while(j >= 0 && arr[j] > element) {
            arr[j+1] =arr[j];
            j--;
        }
        arr[j+1] = element;

        insertionSort(arr, i+1);
    }

    public static void print(int arr[]) {
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11};
//        int arr[] = {2, 3, 4, 6, 8, 7};
//        int arr[] = {2, 3, 4, 6, 5, 7, 9, 8};

        print(arr);
        insertionSort(arr,1);
        System.out.println();
        print(arr);
    }
}
