package TwoDArray;

public class AllDiagonalFromRightSide {
    public static void main(String[] args) {
        int [][]arr = new int[4][5];
        arr[0] = new int[]{1,2,3,4,5};
        arr[1] = new int[]{6,7,8,9,10};
        arr[2] = new int[]{11,12,13,14,15};
        arr[3] = new int[]{16,17,18,19,20};

        int start = 1;
        int end = arr[0].length-1;
        while( end >= 0) {
            int i = 0;
            int j = end;

            System.out.print("Diagonal  " +start+ " : " );
            while(i< arr.length && j >= 0) {
                System.out.print(arr[i][j]+" ");
                i++;
                j--;

            }

            System.out.println();
            start++;
            end--;
        }
    }
}
