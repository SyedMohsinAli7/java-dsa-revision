package Patterns;

//public class Pattern6 {
//    public static void main(String[] args) {
//        for(int i = 1; i<6 ; i++){
//            for (int j = 5,k=1; j >= i; j--) {
//                System.out.print(k+++" ");
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
//            for (int j = n; j > i; j--) { //or
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

