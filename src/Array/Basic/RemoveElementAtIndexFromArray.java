//9
package Array.Basic;

public class RemoveElementAtIndexFromArray {
    public static void main(String[] args) {
//        int arr[] = new int[]{1,2,3,4,5};
        int arr[] = new int[]{4,5,9,8,1};

        int index = 3;
        int N = arr.length;
        int i ;

        for(i = 0; i < N; i++) {
            if(i == index) {
                break;
            }
        }

        for(int j = i; j < N-1; j++) {
            arr[j] = arr[j+1];
        }

        for(i = 0; i < N-1; i++) {
            System.out.print(arr[i] +" ");
        }
    }


}
