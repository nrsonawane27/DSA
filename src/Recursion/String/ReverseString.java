package Recursion.String;

import java.util.Scanner;

public class ReverseString {
    static String newStr = "";
    static String reverseString(String str, int length) {
//        if(length == 0) {
//            newStr+=str.charAt(length);
//            return newStr;
//        }
        if (length == str.length()-1) {
            newStr+=str.charAt(length);
            return newStr;
        }
        return newStr += reverseString(str,length+1) + str.charAt(length) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        int length = str.length()-1;
        int length = 0;
        System.out.println("reverse string is : " +reverseString(str, length));


    }
}
