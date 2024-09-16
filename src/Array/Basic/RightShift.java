/*
    Given an integer array A of size N and an integer B you have to return the
    same array after rotating it B times towards the right
 */
package Array.Basic;

public class RightShift {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int B = 2;
        int N = arr.length;
        int result[] = new int[N];

        for(int i = 0; i < N; i++) {
            result[(i+B) % N] = arr[i];
        }

        System.out.println("Rotated array");
        for(int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
