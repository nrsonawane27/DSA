//Binary search using recursion

package Searching;

public class BinarySearchUsingRecursion {
    public static int Binary(int arr[], int search, int start , int end) {
        int mid = (start + end) / 2;

        if(start >= end) {
            if(arr[mid] == search) {
                return mid;
            }

            return -1;
        }

        if (arr[mid] < search) {
            start = mid + 1;
        }

        if (arr[mid] > search) {
            end = mid - 1;
        }
        return Binary(arr, search, start , end ) ;
    }

    public static void main(String[] args) {
        int []arr = {4, 7, 11, 24, 37, 55, 75, 87};
        int search =88;

        int start = 0;
        int end = arr.length - 1;

        int index = Binary(arr, search,start, end);

        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " +index);
        }

    }
}
