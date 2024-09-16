/*
   Given integer array of size N leftmax of i contains the
   maximum forth index 0 to the index i (Using carry forward method)
   example :
   input :
      arr = [-3, 6, 2, 4, 3, 2, 8, -2, 3, 1]
   output :
     leftMax = [-3, 6, 6, 6, 6, 6, 8, 8, 8]
 */
package Array.Basic;

public class LeftMax {
    public static void main(String[] args) {
        int []arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};


        int []leftMax = new int[10];
        leftMax[0] = arr[0];
        //carry forward method
        for(int i=1; i < arr.length; i++) {
            if(arr[i] > leftMax[i-1]){
                leftMax[i] = arr[i];
            } else {
                leftMax[i] = leftMax[i-1];
            }
        }

        for (int j : leftMax) {
            System.out.print(j + " ");
        }
    }
}
