package KnowBasicMaths;

public class GCDOrHCF {

    public static int GCDOrHCF(int n, int x){

        int max = Math.max(n, x);
        int gcd = 0;
        for (int i = 1 ; i*i< max; i++) {
            if(n%i == 0 && x%i == 0){
                gcd = i;
                if(n/i != i && x/i != i){
                    gcd = i;
                }
            }
        }
        return gcd;
    }


    public static void main(String[] args) {
        System.out.println(GCDOrHCF(36,60));
    }
}
