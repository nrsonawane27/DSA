/*
    You are given an integer N. You need to convert all zeros of N to 5.
    Example 1:
    Input: N = 1004
    Output: 1554
    Explanation: There are two zeroes in 1004 on replacing all zeroes with "5",
     the new number will be "1554".
 */
package Array.Basic;

public class ReplaceZeroWithFive  {
    public static int replaceNumber(int num ) {
        int newNum = 0;
        int rank = 1;
        while(num > 0) {
            if(num % 10 == 0) {
                newNum = newNum + 5 * rank;
            }
            newNum = newNum + num % 10 * rank;
            num /= 10;
            rank *= 10;
        }
        return newNum;
    }

    public static void main(String[] args) {

        int num = 105003040;
        System.out.println(replaceNumber(num));
    }
}
