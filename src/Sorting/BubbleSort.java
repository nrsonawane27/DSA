//Bubble Sort
package Sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        int N = arr.length;

        int count = 0;
        boolean swapped = false;
        for(int i = 0; i < N-1; i++) {
            for(int j = 0; j < N-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
                count++;
                if(swapped == false) {
                    break;
                }
            }
        }
        System.out.println("\nCount of iterations : " +count);
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

        print(arr);
        bubbleSort(arr);
        System.out.println();
        print(arr);
    }
}
