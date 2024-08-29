/*
    Given a matrix of N * N .Rotate the matrix
    90 degree clockwise from the top right corner.
    Note : (No new matrix)
 */

package TwoDArray;

public class Roatate90DegreeClockwise {
    public static void main(String[] args) {
        int [][]arr = new int[4][4];
        arr[0] = new int[]{1,2,3,4};
        arr[1] = new int[]{5,6,7,8};
        arr[2] = new int[]{9,10,11,12};
        arr[3] = new int[]{13,14,15,16};

        //step 1 :  Find Transpose of matrix
        for(int i = 0; i<=arr.length-1; i++) {
            for(int j=i+1; j<=arr.length-1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //step 2 : Swap the element column wise
        for(int i = 0; i < arr.length; i++) {
            int m = arr[0].length-1;
            for(int j = 0; j < arr[0].length/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][m];
                arr[i][m] = temp;
                m--;
            }
        }

        //print 2D matrix
        for(int i = 0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[0].length-1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
time complexity = O(n^2) -------quadratic complexity
space complexity = O(1) -------constant complexity
 */