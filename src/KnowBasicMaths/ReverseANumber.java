package KnowBasicMaths;

import java.util.Scanner;

public class ReverseANumber {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int rev = reverseNumber(n);
        System.out.println("The reverse of the given no. is : "+rev);
    }
}
