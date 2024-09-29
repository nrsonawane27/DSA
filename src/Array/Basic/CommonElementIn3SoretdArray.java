//19
package Array.Basic;

public class CommonElementIn3SoretdArray {

    public static void find(int arr1[], int arr2[], int arr3[]) {
        int k1 = 0;
        int j1 = 0;
        for(int i = 0; i < arr1.length; i++) {
            for(int j = j1; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    for(int k = k1; k < arr3.length; k++) {
                        if(arr2[j] == arr3[k]) {
                            System.out.println(arr3[k]);
                            k1 = k+1;
                            break;
                        }
                    }
                    j1 = j+1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        //set 2
//        int arr1[] = {1, 5, 5};
//        int arr2[] = {3, 4, 5, 5, 10};
//        int arr3[] = {5, 5, 10, 20};

        find(arr1, arr2, arr3);
    }
}
