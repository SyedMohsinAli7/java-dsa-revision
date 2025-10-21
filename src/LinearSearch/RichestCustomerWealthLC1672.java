package LinearSearch;

public class RichestCustomerWealthLC1672 {
    public static void main(String[] args) {

        int[][] persons = {
                {1, 36, 3},
                {1, 1, 2},
                {2, 2, 3}
        };

        System.out.println(whoHasMaxWealth(persons));

    }

    public static int whoHasMaxWealth(int[][] accounts) {
        int highestTotal = 0;
        for (int[] account : accounts) {
            int total = 0;
            for (int wealthCount : account) {
                total += wealthCount;
            }
            if (total > highestTotal) highestTotal = total;
        }

        return highestTotal;
    }
}
