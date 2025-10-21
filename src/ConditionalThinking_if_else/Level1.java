package ConditionalThinking_if_else;

import java.util.Scanner;

public class Level1 {

    public static void checkNumber(int n) {
        System.out.print(
                (n < 0) ? "Number is -ve" :
                        (n == 0) ? "Number is zero" : "Number is +ve"
        );
    }

    public static void evenOrOdd(int n) {
        System.out.print(
                (n % 2 == 0) ? "Number is even" : "Number is odd"
        );
    }

    public static void divisibleBy5(int n) {
        System.out.print(
                (n % 5 == 0) ? "Divisible by 5" : "Not Divisible by 5"
        );
    }

    public static void divisibleBy5and3(int n) {
        System.out.print(
                (n % 5 == 0 && n % 3 == 0) ? "Divisible by 5 and 3" : "Not Divisible by 5 and 3"
        );
    }

    public static void leapYearOrNot(int n) {
        System.out.print(
                (n % 4 == 0 && (n % 100 != 0 || n % 400 == 0)) ? "Leap Year" : "Not a Leap year"
        );
    }

    public static void vowelOrConsonant(String s) {
        char c = s.charAt(0);
        char x = Character.toLowerCase(c);

        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();

//        checkNumber(n);
//        evenOrOdd(n);
//        divisibleBy5(n);
//        divisibleBy5and3(n);
        leapYearOrNot(n);


    }
}
