//39

package Array.Basic;

public class LeadersInArray {

    public static void leaders(int arr[]) {
        int N = arr.length;

        for(int i = 0; i < N; i++) {
            boolean flag = true;
            for(int j = i+1; j < N; j++) {
                if(arr[i] <   arr[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
//        int arr[] = new int[]{16, 17, 4, 3, 5, 2};

        int arr[] = new int[]{1, 2, 3, 4, 5, 2};


        leaders(arr);
    }
}
