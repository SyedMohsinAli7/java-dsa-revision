package KnowBasicMaths;

public class ArmstrongNumber {

    public static boolean checkArmstrong(int n){

//        Math.pow(n,3);
        int num = n;
        int res = 0;

        while(n>0){
            int rem = n % 10;
            res = res + (int) Math.pow(rem,3);
            n/=10;
        }
        return num == res;
    }


    public static void main(String[] args) {
        System.out.println(checkArmstrong(154));
    }
}
