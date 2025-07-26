

public class MaxWealth {
    public static int maximumWealth(int[][] accounts) {
        int[] person = new int[3];
        int maxwealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            person[i] = sum;
        }
        maxwealth = person[0];
        for (int i = 1; i < person.length; i++) {
            if (maxwealth < person[i]) {
                maxwealth = person[i];
            }
        }
        return maxwealth;
    }

    public static void main(String[] args) {
    int[][] arr={
         {1,2,3},
         {4,1,6},
         {3,3,7}
    };
    int ans=maximumWealth(arr);
    System.out.println("Maximum wealth is :"+ans);
    }
}
