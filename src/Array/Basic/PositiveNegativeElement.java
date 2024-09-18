package Array.Basic;

public class PositiveNegativeElement {

    public static void arrangeElement(int arr[]) {
        int N = arr.length;

        for(int i = 0; i < N-1; i++) {
            if(i % 2 == 0) {
                if(arr[i] <= 0) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            } else {
                if(arr[i] >= 0) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
//        int arr[] = new int[]{-1, 2, -3, 4, -5, 6};
        int arr[] = new int[]{-3, 2, -4, 1, 4, 6, -1, -5};


        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

        arrangeElement(arr);

        System.out.println("After");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
