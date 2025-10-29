package Arrays_Easy;

import java.util.Arrays;

public class RotateArrayNTimes {

    public static void rotateBF(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) k = k + nums.length;
        for (int i = 1; i <= k; i++) {
            rotateOnce(nums);
        }
    }

    public static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateOptimal(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) k = k + nums.length;

        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);

    }

    public static void rotateOnce(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
//        rotateBF(arr, 3);
//        System.out.println(Arrays.toString(arr));
        rotateOptimal(arr, 3);
        System.out.println(Arrays.toString(arr));

    }
}
