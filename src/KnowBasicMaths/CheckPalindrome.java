package KnowBasicMaths;

import java.util.Scanner;

public class CheckPalindrome {

    public static int reverseNumber(int n){
        int rev = 0;
        int num = Math.abs(n);

        while(num>0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }
        return n > 0? rev : -rev;
    }


    public static boolean checkIntegerPalindrome(int n){
        return n == reverseNumber(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        String s = checkIntegerPalindrome(n) ? "Yes" : "No";
        System.out.println("The given no. is Palindrome ?? : "+ s);
    }
}
