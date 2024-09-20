package Sorting;

public class SelectionSortUsingRecursion {

    public static void selectionSort(int arr[], int i) {
        if(i == arr.length) {
            return;
        }

        int minIndex = i;
        for(int j = i+1; j < arr.length; j++) {
            if(arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if(arr[i] != arr[minIndex]) {
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        selectionSort(arr, i+1);
    }

    public static void print(int arr[]) {
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
//        int arr[] = {64, 34, 25, 12, 22, 11};
        int arr[] = {2, 3, 4, 6, 8, 7};
//        int arr[] = {2, 3, 4, 6, 5, 7, 9, 8};

        int N = arr.length;

        System.out.println("Before sorting");
        print(arr);
        selectionSort(arr, 0);
        System.out.println("\nAfter sorting");
        print(arr);

    }
}
