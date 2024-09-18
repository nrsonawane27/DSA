package Array.Basic;

public class PeakElement {

    public static void findPeakElement(int arr[]) {
        int N = arr.length;
        for(int i = 1; i < N-1; i++) {
            if(arr[i] > arr[i+1] & arr[i] > arr[i-1]) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
//        int arr[] = {5, 10, 20, 15};
        int arr[] = {10, 20, 15, 2, 23, 90, 67};

        findPeakElement(arr);
    }
}
