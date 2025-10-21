package LearnBasicRecursion;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Collections.swap;

public class BasicRecursionProblems {

    public static void print1ToN(int count, int n){
        if (count>3){
            return;
        }
        System.out.println("Value of count is : "+count);
        print1ToN(count+1,n);
    }

    public static void print1ToNuUsingBackTracking(int count, int n){
        if (count<1){
            return;
        }
        print1ToNuUsingBackTracking(count-1,n);
        System.out.println("Value of count is : "+count);
    }

    public static void printNto1UsingBacktracking(int count , int n){

        if (count > n) return;

        printNto1UsingBacktracking(count+1, n);
        System.out.println("Value of count is : "+count);

    }

    public static void sumOfFirstNNumbers(int n, int sum){
        if(n<1){
            System.out.println("The sum of natural numbers is : "+sum);
            return;
        }
        sumOfFirstNNumbers(n-1,sum+n);
    }

    public static void sumOfFirstNNumbers2(int n, int sum,int limit){
        if(n>limit){
            System.out.println("The sum of natural numbers is : "+sum);
            return;
        }
        sumOfFirstNNumbers2(n+1,sum+n,limit);
    }

    public static int sumOfFirstNNumbersUsingFunctionalWay(int n){
        if (n == 0){
            return 0;
        }
        return n+sumOfFirstNNumbersUsingFunctionalWay(n-1);
    }
    public static int factorialOfFirstNNumbers(int n){
        if (n == 1){
            return 1;
        }
        return n*factorialOfFirstNNumbers(n-1);
    }

    public static void reverseArrayUsingTwoPointers(List<Integer> arr, int leftPtr, int rightPtr){
        if (leftPtr >= rightPtr) return;
        swap(arr,leftPtr,rightPtr);
        reverseArrayUsingTwoPointers(arr,leftPtr+1, rightPtr-1);
    }

    public static void reverseArrayUsingOnePointer(List<Integer> arr, int leftPtr, int size){
        if (leftPtr >= size/2) return;
        swap(arr,leftPtr,size-leftPtr-1);
        reverseArrayUsingOnePointer(arr,leftPtr+1, size);
    }

    public static String palindromeOrNot(String s){
//        char[] arr = s.toCharArray();
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(s.split("")));
        ArrayList<String> arrList1 = new ArrayList<>(Arrays.asList(s.split("")));
//        System.out.println(arr);
        int leftPtr = 0;
       while(leftPtr<arrList.size()/2){
           Collections.swap(arrList,leftPtr,arrList.size()-leftPtr-1);
           leftPtr++;
            }
        System.out.println(arrList1+"----" +arrList);
        return arrList.equals(arrList1)?"Yes":"No";
    }
    public static boolean palindromeViaRecursion(int i, String s){

        if(i>= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;

    return palindromeViaRecursion(i+1, s);
    }


    public static boolean palindromeViaRecursion1(String s){

        if( s.length() <= 1) return true;
        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        return palindromeViaRecursion1(s.substring(1,s.length()-1));
    }

    public static int fibnocciSeries(int n){

        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibnocciSeries(n-1)+fibnocciSeries(n-2);
    }

    public static int fib(int n) {
        if(n <= 1) return n;
        int last = fib(n-1);
        int secondLast = fib(n-2);
        return last + secondLast;
    }


    public static void main(String[] args) {
//        int count = 3;
        int count  = 0;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int n = sc.nextInt();

//        print1ToNuUsingBackTracking(count, n);
//        printNto1UsingBacktracking(count,n);
//            sumOfFirstNNumbers2(1,0, n);
//        System.out.println("The sum of n natural no.'s is : "+sumOfFirstNNumbersUsingFunctionalWay(n));
//        System.out.println("The factorial of n natural no.'s is : "+factorialOfFirstNNumbers(n));

        List<Integer> arr = Arrays.asList(1,2,3,4,5);

//        reverseArrayUsingTwoPointers(arr,0 , arr.size()-1);
//        System.out.println(arr);

        int size = arr.size();
//        System.out.println(size);
//        reverseArrayUsingOnePointer(arr,0, size);
//        System.out.println(arr);

//        System.out.println("Is the String Palindrome ? : "+palindromeViaRecursion1( "syed"));

//        for (int i = 0; i < 5; i++) {
//            System.out.print(fibnocciSeries(i) + " ");
//        }

        System.out.println(fib(5));
    }
}
