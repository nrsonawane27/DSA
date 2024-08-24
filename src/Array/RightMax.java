/*
   Given an array of size N. Build an array right max of size N.
   Right max of i contains the maximum for the index i to the index N-1.
   (Using carry forward method)
 */
package Array;
public class RightMax {
    public static void main(String [] args) {
        int []arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};


        int []rightMax = new int[10];
        rightMax[9] = arr[9];
        //carry forward method
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] > rightMax[i+1]){
                rightMax[i] = arr[i];
            } else {
                rightMax[i] = rightMax[i+1];
            }
        }

        for (int j : rightMax) {
            System.out.print(j + " ");
        }
    }
}