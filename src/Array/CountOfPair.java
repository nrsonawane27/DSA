/*
    Given an character array (lowercase)
    return the count of pair(m, n) such that
       a) m < n
       b) arr[m] = 'a'
           arr[n] = 'g'
*/

package Array;

public class CountOfPair {

    public static int count (char []ch, char m, char n) {
        int count = 0;
        int aCount =0;

        for(int i=0; i<ch.length; i++) {
            if (ch[i] == m) {
                aCount++; // Increment count of 'a'
            } else if (ch[i] == n) {
                count += aCount; // Every 'g' found adds to count all previous 'a' counts
            }
        }

        return count;
    }


    public static void main(String[] args) {
        char []ch = {'a', 'b', 'e', 'g', 'a', 'g'};
//        int count = 0;
//        int aCount =0;
//
//        for(int i=0; i<ch.length; i++) {
//            if (ch[i] == 'a') {
//                aCount++; // Increment count of 'a'
//            } else if (ch[i] == 'g') {
//                count += aCount; // Every 'g' found adds to count all previous 'a' counts
//            }
//        }
//        System.out.println(aCount);
//        System.out.println(count);

        System.out.println("Count of pair(m,n) : " +count(ch, 'b', 'g'));
    }
}
