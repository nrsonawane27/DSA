//18
package Array.Basic;

public class SubArarryWithGivenSum {

    public static void subAraryWithGivenSum(int arr[], int target) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        //calculate prefix array
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

        int sum = 0;
        int startIdx = -1;
        int endIdx = -1;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            for(int j = 0; j < i; j++) {
                int newSum =  sum - prefix[j] ;
                if(newSum == target) {
                    startIdx = j + 1;
                    endIdx = i;
                }
            }
        }

        if(startIdx == -1) {
            System.out.println("No sub array found");
        } else {
            System.out.println("Sum found between indexes "+startIdx+" and "+ endIdx);
        }
    }
    public static void main(String[] args) {
//        int arr[] = {1, 4, 20, 3, 10, 5};
//        int target = 33;

        int arr[] = {1, 4, 0, 0, 3, 10, 5};
        int target = 7;

//        int arr[] = {1, 4};
//        int target = 0;

        subAraryWithGivenSum(arr, target);
    }
}
