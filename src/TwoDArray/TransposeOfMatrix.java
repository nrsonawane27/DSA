package TwoDArray;

public class TransposeOfMatrix {
    public static void main(String[] args) {
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



        for(int i = 0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[0].length-1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
