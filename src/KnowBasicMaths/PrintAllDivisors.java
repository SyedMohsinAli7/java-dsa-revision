package KnowBasicMaths;

import java.util.*;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrintAllDivisors {

    public static void printAllDivisors(int n){
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (n / i != i){
                    divisors.add(n/i);
                }
            }
        }
        divisors.sort((a,b)-> a-b);
        System.out.println(divisors);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        printAllDivisors(n);
    }
}
