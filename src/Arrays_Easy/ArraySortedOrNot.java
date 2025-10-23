package Arrays_Easy;

import java.util.Arrays;
import java.util.List;

public class ArraySortedOrNot {

    public static String sortedOrNot(List<Integer> arr) {

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) < arr.get(i)) descending = false;
            if (arr.get(i - 1) > arr.get(i)) ascending = false;
        }
        return ascending || descending ? "Sorted " : "Not Sorted";
    }

    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 7, 9, 10);
        List<Integer> nums = Arrays.asList(10, 9, 7, 4, 3, 2, 1, 0);
        System.out.println(sortedOrNot(nums));
    }
}
