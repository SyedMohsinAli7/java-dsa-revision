package LinearSearch;

public class EvenNoOfDigitsInArrayLC1295 {
    public static void main(String[] args) {

        int[] arr = {12, 345, 2, 6, 7896, 87, -2555, 0};
        System.out.println(findNumbers(arr));

    }

    public static int findNumbers(int[] arr) {
        int count = 0;

        for (int i : arr) {
            if (noOfDigits1(i) % 2 == 0) count++;
        }
        return count;
    }

    public static int noOfDigits1(int n) {

        int count = 0;

        if (n < 0) n *= -1;

        if (n >= 0 && n <= 9) return 1;
        else {
            while (n > 0) {
                n /= 10;
                count++;
            }
            return count;
        }
    }

    public static int noOfDigits2(int n) {
        String s = "" + n + "";
        return s.length();
    }
}
