package Array;

public class ReverseArray {

    public static void reverse(int marks[]){
        int first =0;
        int last = marks.length-1;

        while (first<last) {
            //swap
            int temp = marks[first];
            marks[first] = marks[last];
            marks[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]){
        int arr[] = {5, 3, 2, 7, 8, 5, 2};
        int N = arr.length;

        //Reverse array
        System.out.println("\nReverse array\n");
        reverse(arr);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }

    }
}