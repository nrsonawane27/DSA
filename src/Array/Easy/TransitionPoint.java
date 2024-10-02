//9

package Array.Easy;

public class TransitionPoint {

    public static int transitionPoint(int arr[]) {
        int N = arr.length;

        for(int i = 1; i < N; i++) {
            if(arr[i] != arr[i-1]) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

//        int arr[] = new int[]{0, 0, 0, 1, 1};

        int arr[] = new int[]{0, 0, 0};


        System.out.println(transitionPoint(arr));
    }
}
