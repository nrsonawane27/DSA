/*
     This is a functional problem. Your task is to return the product of array elements
     under a given modulo.
    The modulo operation finds the remainder after the division of one number by another.
     For example, K(mod(m))=K%m= remainder obtained when K is divided by m
    Example 1:
    Input:
    1
    4
    1 2 3 4
    Output:
    24
    Input:
    The first line of input contains T denoting the number of test cases. Then each
     of the T lines contains a single positive integer N denotes the number of elements
     in the array. The next line contains 'N' integer elements of the array.
    Output:
    Return the product of array elements under a given modulo. That is,
    return (Array[0]* Array[1]*Array[2]...*Array[n])%modulo.
    Constraints:
    1<=T<=200
    1<=N<=10^5
    1<=ar[i]<=10^5
*/

package Array.Basic;

import java.util.Scanner;

public class ProductOfArrayElement {

    public static long  productOfElement(int arr[],int mod) {
        long product = 1;
        for(int n : arr) {
            product *= n % mod;
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int T = sc.nextInt();

        int mod = 24;

        for(int i = 1; i <= T; i++) {
            System.out.print("Enter the size of array : " );
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter the elements of array : ");
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            System.out.println(productOfElement(arr, mod));

        }
    }
}
