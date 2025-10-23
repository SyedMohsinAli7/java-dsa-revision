package Arrays_Easy;

import java.util.ArrayList;
import java.util.List;

public class LargestElement {

    static int largestElement(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(1);
        nums.add(7);
        nums.add(9);
        nums.add(0);
        System.out.println(largestElement(nums));
    }
}
