package Arrays_Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {


    static int Optimal_secondLargestElement(List<Integer> arr) {
        int secondLargest = Integer.MIN_VALUE;
        int largest = arr.getFirst();

        for (int i = 1; i < arr.size(); i++) {
            if (largest < arr.get(i)) {
                secondLargest = largest;
                largest = arr.get(i);
            } else if (secondLargest < arr.get(i) && arr.get(i) != largest) {
                secondLargest = arr.get(i);
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    static int Better_secondLargestElement(List<Integer> arr) {
        int secondLargest = Integer.MIN_VALUE;
        int largest = arr.getFirst();

        for (int i = 0; i < arr.size(); i++) {
            if (largest < arr.get(i)) {
                largest = arr.get(i);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (secondLargest < arr.get(i) && arr.get(i) != largest) {
                secondLargest = arr.get(i);
//                break;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 1, 3, 1, 1, 1);
//        System.out.println(Optimal_secondLargestElement(nums));
        System.out.println(Better_secondLargestElement(nums));
    }
}


