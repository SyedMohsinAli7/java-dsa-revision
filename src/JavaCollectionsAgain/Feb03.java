package JavaCollectionsAgain;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Feb03 {
    public static void main(String[] args) {

//        List<String> list = Arrays.asList("goolge", "nareshIT", "NareshIT", "progress");
//        Collections.reverse(list);
//        for (String str : list)
//            System.out.print(str + " ");

//        ArrayList<String> al = new ArrayList<>();
//        al.add("25");
//        al.add("Naresh");
//        al.add("A");
//        al.add("37");
//        Iterator<String> it = al.iterator();
//        while (it.hasNext())
//            System.out.print(it.next() + " ");

//        ArrayList<String> al = new ArrayList<>();
//        al.add("25");
//        al.add("Naresh");
//        al.add("A");
//        al.add("37");
//        Iterator<String> it = al.iterator();
//        while (it.hasNext())
//            System.out.print(it + " ");// Here the pointer doesn't move to next place as there is no it.next();


//        ArrayList<String> al = new ArrayList<>();
//        al.add("25");
//        al.add("Naresh");
//        al.add("A");
//        al.add("37");
//        al.remove(4);
//        for (String str : al)
//            System.out.print(str + " ");


//        ArrayList<String> al = new ArrayList<>();
//// ...
//        al.remove(4);
//        You're working with an ArrayList, not a raw array.
//
//        Therefore, the exception thrown is:
//
//        java.lang.IndexOutOfBoundsException
//
//        If you were working with a regular array, then you'd get:
//
//        java.lang.ArrayIndexOutOfBoundsException

//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            al.add(i);
//        }
//        for (int str : al)
//            System.out.print(str + " ");


//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 5; i < 10; i++) {
//            al.add(i);
//        }
//        al.remove(4);
//        for (int str : al)
//            System.out.print(str + " ");


//        ArrayList<String> al = new ArrayList<>();
//        al.add("google");
//        al.add("Naresh");
//        al.add("Information");
//        al.add("Technology");
//        for (int i = 0; i < al.size(); i++) {
//            System.out.print(al.get(i).substring(0, 6));
//        }

//        ArrayList<String> al = new ArrayList<>();
//        System.out.println(al);

        ArrayList al = new ArrayList<>();
        al.add(5);
        al.add("");
        al.add(10);
        System.out.println(al.contains(6));
        System.out.println(al.contains(10));
        System.out.println(al.contains(null));

        Collections.sort(al, Collections.reverseOrder());

    }
}
