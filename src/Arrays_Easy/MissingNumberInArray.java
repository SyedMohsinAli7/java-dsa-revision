package Arrays_Easy;

public class MissingNumberInArray {

    public static int missingNumberBrute(int[] arr) {

        int n = arr.length;


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int nsum = ((n + 1) * (n + 1 + 1)) / 2;

        return nsum - sum;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(missingNumberBrute(arr));
        ;
    }
}
