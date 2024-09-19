package Sorting;

public class BubbleSortUsingRecursion {

    static int count = 0;
    public static void bubbleSort(int arr[], int N) {
        if(N == 1)
            return;

        boolean swapped = false;
        for(int i = 0; i < N-1; i++) {
            if(arr[i] > arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                swapped = true;
            }
            count++;
            if(swapped == false) {
                break;
            }
        }
        bubbleSort(arr, N-1);
    }

    public static void print(int arr[]) {
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
//        int arr[] = {64, 34, 25, 12, 22, 11};
//        int arr[] = {2, 3, 4, 6, 8, 7};
        int arr[] = {2, 3, 4, 6, 5, 7, 9, 8};


        int N = arr.length;

        System.out.println("Before sorting");
        print(arr);
        bubbleSort(arr, N);
        System.out.println();
        System.out.println("After sorting");
        print(arr);
        System.out.println();
        System.out.println("Count of iterations : " +count);
    }
}
