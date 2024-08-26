/*
    print the all diagonals of a matrix from left to right
    A. starts from 0th rows
    B. All diagonals
 */

package TwoDArray;

public class AllDiagonalsFromLeftSide {
    public static void main(String[] args) {

        int [][]arr = new int[4][5];
        arr[0] = new int[]{1,2,3,4,5};
        arr[1] = new int[]{6,7,8,9,10};
        arr[2] = new int[]{11,12,13,14,15};
        arr[3] = new int[]{16,17,18,19,20};

        int start = 0;
        int end = 0;
        int count = 1;
        while(end < arr[0].length) {
            int i = start;
            int j = end;

            System.out.print("Diagonal  " +count+ " : " );
            while(i < arr.length && j < arr[0].length) {
                System.out.print(arr[i][j]+" ");
                i++;
                j++;
            }
            System.out.println();
            start = 0;
            end++;
            count++;
        }
    }
}
