/*
      count the number of elements that have atleast one element greater
      than itself.
 */
package Array.Basic;

public class CountOfElement {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4, 7, 4, 8, 4};
        int count = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                count = 0;
            }

            if(arr[i] == max) {
                count++;
            }
        }

        System.out.println(arr.length - count);
    }
}
