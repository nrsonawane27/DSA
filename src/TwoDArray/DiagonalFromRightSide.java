package TwoDArray;

public class DiagonalFromRightSide {
    public static void main(String[] args) {

        int [][]arr = new int[][] {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        int i = 0;
        int j = arr[0].length-1;

        while(i< arr.length && j >= 0) {
            System.out.print(arr[i][j]+" ");
            i++;
            j--;
        }
    }
}
