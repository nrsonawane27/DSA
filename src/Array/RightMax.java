/*
   Implementation of carry forward method
    using carry forward method change the element of array with the current max number
    until the next element is greater than current element from side right side of array
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