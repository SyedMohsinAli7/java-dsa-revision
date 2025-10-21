package KnowBasicMaths;

import java.util.Scanner;

public class CheckForPrime {

    public static boolean checkForPrimeBruteForce(int n){

        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }
        }

        return count <= 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Is the Number prime ? : "+(checkForPrimeBruteForce(n)? "Yes":"No"));
    }
}
