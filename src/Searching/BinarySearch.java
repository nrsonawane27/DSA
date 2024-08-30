package Searching;

public class BinarySearch {
    public static int Binary(int arr[], int search) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == search) {
                return mid;
            }
            if (arr[mid] < search) {
                start = mid + 1;
            }

            if (arr[mid] > search) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {4, 7, 11, 24, 37, 55, 75, 87};
        int search =11;

        int start = 0;
        int end = arr.length - 1;

        int index = Binary(arr, search);

        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " +index);
        }

    }
}
