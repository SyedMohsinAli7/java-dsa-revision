package Arrays_Easy;

import java.util.Arrays;
import java.util.List;

public class Min_And_SecondMin {

    public static int minElement(List<Integer> arr) {
        int min = Integer.MAX_VALUE;

        if (arr.isEmpty()) return -1;

        for (Integer ele : arr) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }

    public static int secondMinElement(List<Integer> arr) {
        int smin = Integer.MAX_VALUE;
        int min = arr.getFirst();

        if (arr.isEmpty()) return -1;

        for (Integer ele : arr) {
            if (ele < min) {
                smin = min;
                min = ele;
            } else if (ele < smin && ele != min) {
                smin = ele;
            }
        }
        return smin;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 1, 3, 1, 1, -2, 4);
        System.out.println(minElement(nums));
        System.out.println(secondMinElement(nums));
    }
}
