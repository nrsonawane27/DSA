/*
     print the element of square or rectangular matrix
     in spiral format
 */
package TwoDArray;

public class SpiralOfMatrix {
    public static void main(String[] args) {

        //square matrix with odd length
        int [][]arr = new int[5][5];
        arr[0] = new int[]{1,2,3,4,56};
        arr[1] = new int[]{5,6,7,8,90};
        arr[2] = new int[]{9,10,11,12,78};
        arr[3] = new int[]{13,14,15,16,45};
        arr[4] = new int[]{17,18,19,20,21};

        //square matrix with even length
//        int [][]arr = new int[4][4];
//        arr[0] = new int[]{1,2,3,4};
//        arr[1] = new int[]{5,6,7,8};
//        arr[2] = new int[]{9,10,11,12};
//        arr[3] = new int[]{13,14,15,16};

        int N = arr[0].length-1;
        int M = arr.length-1;
        int i = 0;
        int j = 0;

        while(N >= 0 && M >= 0) {
            for(int k = 0 ; k <= N-1; k++ ) {
                System.out.print(arr[i][j] +" ");
                j++;
            }

            for(int k = 0 ; k <= M-1; k++ ) {
                System.out.print(arr[i][j] +" ");
                i++;
            }

            for(int k = 0 ; k <= N-1; k++ ) {
                System.out.print(arr[i][j] +" ");
                j--;
            }

            for(int k = 0  ; k <= M-1; k++) {
                System.out.print(arr[i][j] +" ");
                i--;
            }

            //it only required when square matrix is of odd length
            if(N == 0 && M == 0) {
                System.out.println(arr[i][j]);
            }

            i++;
            j++;
            N = N - 2;
            M = M -2;
        }
    }
}
