//Write a program to add the digit of number

package Recursion.Number;

public class SumOfDigitInNumber {

    int sum(int num) {
        //using recursion
        if(num == 0) {
            return num;
        }

//        int rem = num % 10;
//        sum += rem;
//        sum(num/10);
        return num % 10 + sum(num/10) ;

    }
    public static void main(String[] args) {
        SumOfDigitInNumber obj = new SumOfDigitInNumber();
        int res = obj.sum(123);
        System.out.println(res);
    }
}
