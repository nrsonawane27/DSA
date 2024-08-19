package TwoDArray;

public class TransposeOfMatrix {

    public static void print(int [][]arr) {
        for(int i = 0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[0].length-1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        //Transpose of square matrix
        int [][]arr = new int[4][5];
        arr[0] = new int[]{1,2,3,4};
        arr[1] = new int[]{5,6,7,8};
        arr[2] = new int[]{9,10,11,12};
        arr[3] = new int[]{13,14,15,16};

        for(int i = 0; i<=arr.length-1; i++) {
            for(int j=i+1; j<= arr.length-1; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Square matrix Transpose");
        print(arr);

        /*
           time complexity  = O(n^2)
           space complexity = O(1)
         */


        //transpose of rectangular matrix
        int [][]arr2 = new int[4][5];
        arr2[0] = new int[]{1,2,3,4,5};
        arr2[1] = new int[]{6,7,8,9,10};
        arr2[2] = new int[]{11,12,13,14,15};
        arr2[3] = new int[]{16,17,18,19,20};

        int N = arr2.length;   // row size
        int M = arr2[0].length; //column size
        int newarr[][] = new int[M][N];

        for(int i = 0; i< N; i++) {
            for(int j = 0; j < M; j++) {
                newarr[j][i] = arr2[i][j];
            }
        }

        System.out.println("\nTranspose of rectangular matrix");
        print(newarr);

        /*
           time complexity  = O(n^2)
           space complexity = O(n)
         */
    }
}
