package KnowBasicMaths;

import java.util.Scanner;

import static java.lang.Math.log10;

public class CountDigits {

    public static int bruteForceMethod(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static int optimalSolutionMethod(int n){
        return (int)(log10(n)+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

//        int count = bruteForceMethod(n);
        int count = optimalSolutionMethod(n);

        System.out.println("The digit count is : "+count);
    }
}
