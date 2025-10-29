package JavaCollectionsAgain;

import java.util.*;

public class Oct2525 {

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {

        HashSet<Integer> arr1 = new HashSet<>(arr);

        System.out.println(arr1);


        return null;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(2, 5, 3, 1, 1, 8, 5, 9, 3));
        removeDuplicates(arr);
    }
}
