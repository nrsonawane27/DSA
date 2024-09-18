package Array.Basic;

public class ImediateSmallerElement {

    public static void smallerElement(int arr[]) {
        int N = arr.length;

        for(int i = 0; i < N-1; i++) {

            if(arr[i] > arr[i+1]) {
                System.out.print(arr[i+1] +" ");
            } else {
                System.out.print(-1 +" ");
            }

            if(i+1 == N-1) {
                System.out.println(-1 +" ");
            }
        }
    }
    public static void main(String[] args) {
//        int arr[] = {4, 2, 1, 5, 3};
        int arr[] = {5, 6, 2, 3, 1, 7};

        smallerElement(arr);
    }
}
