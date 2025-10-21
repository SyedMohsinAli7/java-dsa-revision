package PatternsTest;

public class AllPatterns {

    public static void pattern1(int n){
        for (int i = 0; i < 2 * n; i++) {

            int cols = i > n ? 0 : i;


            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {

        for (int i = 0; i < 2 * n; i++) {

            int noOfSpaces = i > n ? i - n: n-i;
            int columns = i > n ? 2 * n - i : i;

            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}
