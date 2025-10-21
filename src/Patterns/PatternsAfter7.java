package Patterns;

public class PatternsAfter7 {

    public static void pattern8(int n){

        for (int i = 0; i < n ; i++) {

            for (int j = 0 ; j < n-i-1 ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i+1 ; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){

        for (int i = 0; i < n ; i++) {

            for (int j = 0 ; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*n - (2 * i+1) ; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public  static void  pattern10(int n){
        for (int i = 1; i <= 2 * n - 1 ; i++) {

            int noOfStars = i > n ? 2 * n - i : i;

            for (int j = 1; j <= noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        for (int i = 0; i < n; i++) {
            int value = (i%2 == 0) ? 1 : 0;
            for (int j = 0; j <= i ; j++) {
                System.out.print(value);
                value = 1 - value;
                }
            System.out.println();
            }
        }

    public static void pattern12(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n){
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+ i ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A'+ n - i ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i ; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){

        /*
        for (int i = 0; i < n; i++) {

            //spaces
            for (int j = 0; j < n - i ; j++) {
                System.out.print(" ");
            }

            //first half triangle
            for (char ch = 'A'; ch <= 'A'+i; ch++) {
                System.out.print(ch);
            }

            //second half triangle
            for (char ch = (char) ('A'+ i-1); ch >= 'A' ; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        } */

        for (int i = 0; i < n; i++) {

            char ch = 'A';
            int breakpoint = i; // OR ( 2 * i + 1)/ 2 ;

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E' ; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern18(5);
    }
}
