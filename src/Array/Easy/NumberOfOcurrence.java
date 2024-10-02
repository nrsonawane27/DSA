package Array.Easy;

public class NumberOfOcurrence {

    public static int findOcurrence(int arr[], int X) {
        int index = Binary(arr, X);

        if(index == -1) {
            return 0;
        }

        int count = 0;
        int left = index - 1;
        while(left >= 0 && arr[left] == X) {
            count++;
            left--;
        }

        int right = index;
        while(right < arr.length && arr[right] == X) {
            count++;
            right++;
        }

        return count;
    }

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
//        int arr[] = new int[]{1, 1 , 2, 2, 2, 2, 3};
//        int X = 2;

        int arr[] = new int[]{1, 1 , 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4,4};
        int X = 4;


        System.out.println("Ocurrence of X : "+findOcurrence(arr, X));
    }
}
