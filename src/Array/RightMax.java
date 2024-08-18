/*
   Implementation of carry forward method
    using carry forward method change the element of array with the current max number
    until the next element is greater than current element from side right side of array
 */
package Array;
public class RightMax {
    public static void main(String [] args) {
        int []arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};


        int []rightmax = new int[10];
        rightmax[9] = arr[9];
        //carry forward mathod
        for(int i=arr.length-2; i>=0; i--) {
            if(arr[i] > rightmax[i+1]){
                rightmax[i] = arr[i];
            } else {
                rightmax[i] = rightmax[i+1];
            }
        }

        for(int i = 0; i<rightmax.length; i++) {
            System.out.print(rightmax[i]+ " ");
        }
    }
}