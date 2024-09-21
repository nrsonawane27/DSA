package Sorting;

public class MergeSortUsingRecursion {

    public static void merge(int arr[], int start, int mid, int end) {
        int n1 = mid-start +1;
        int n2 = end-mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i = 0; i < n1; i++) {
            arr1[i] = arr[start+i];
        }

        for(int i = 0; i < n2; i++) {
            arr2[i] = arr[mid+i+1];
        }

        int i = 0, j = 0, k = start;

        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if(start < end) {
            int mid = start + (end-start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1, end);

            merge(arr, start, mid, end);
        }
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
        int start = 0;
        int end = arr.length - 1;

        print(arr);
        mergeSort(arr, start, end);
        System.out.println();
        print(arr);
    }
}
