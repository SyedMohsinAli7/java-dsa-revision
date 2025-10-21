package KunalDsa.BinarySearch;

public class ImplementingBinarySearch {

    static int binarySearchAscendingOrder(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int binarySearchDescendingOrder(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                start = middle + 1;
            } else if (target > arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 7, 8, 9, 12, 14};
        int[] arr1 = {54, 52, 45, 32, 12, 9, 5, 3, 1};
//        System.out.println(binarySearchAscendingOrder(arr, 10));
        System.out.println(binarySearchDescendingOrder(arr1, 32));
    }
}
