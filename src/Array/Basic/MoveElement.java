package Array.Basic;

public class MoveElement {

    public static void arrangeElement(int arr[]) {
        int N = arr.length;

        for(int i = 0; i < N-1; i++) {
                if(arr[i] <= 0) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

                if(arr[i] >= 0 ) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
        }
    }
    public static void main(String[] args) {
//        int arr[] = new int[]{-1, 2, -3, 4, -5, 6};
        int arr[] = new int[]{-3, 2, -4, 1, 4, 6, -1, -5};

        int count = 0;
        for( int i = 0; i < arr.length; i++ ){

            if( arr[i] < 0 ){
                count++;
            }
        }

        int countnegative = 0;

        int newarr[] = new int[arr.length];

        for( int i = 0; i < arr.length; i++){

            if( arr[i] < 0) {

                newarr[countnegative] = arr[i];

                countnegative++;
            }
            if( arr[i] >= 0 ){

                newarr[count] = arr[i];

                count++;

            }
        }

        for( int i = 0 ; i < arr.length; i++){

            System.out.print(newarr[i]+" ");
        }
    }
}
