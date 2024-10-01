package Array.Basic;

public class EvenOcurringElement {

    public static String findEvenOccurrences(int[] arr) {
        int n = arr.length;

        // Step 1: Find the maximum value in the array to define the size of count array
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        // Step 2: Create a count array of size max + 1
        int[] count = new int[max + 1];

        // Step 3: Count occurrences
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 4: Collect elements with even occurrences
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 == 0 && count[i] > 0) {
                result.append(i).append(" ");
            }
        }

        // Step 5: Check if we found any elements with even occurrences
        if (result.length() == 0) {
            return "-1"; // No elements with even occurrences
        }

        return result.toString().trim(); // Return the result
    }

    public static void main(String[] args) {
            int[] arr1 = {9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15};
            int[] arr2 = {23, 12, 56, 34, 32};

            System.out.println(findEvenOccurrences(arr1)); // Output: 12 15 23
            System.out.println(findEvenOccurrences(arr2)); // Output: -1
        }
}
