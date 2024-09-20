package Sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]) {
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            boolean swapped = false;
            int minIndex = i;

            for(int j = i+1; j < N; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if(arr[i] != arr[minIndex]) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapped = true;
            }

            if(swapped == false) {
                break;
            }
        }
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

        System.out.println("Before sorting");
        print(arr);
        selectionSort(arr);
        System.out.println("\nAfter sorting");
//        System.out.println();
        print(arr);

    }
}
