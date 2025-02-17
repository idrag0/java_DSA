package DynamicPro;
import java.util.*;

// leetcode 518
public class coinChange {
    int[][] memo;
    int n;

    public int numberOfWays(int[] coins, int i, int amount) {
        if (amount == 0) {
            return 1;
        }
        
        if (i == n || amount < 0) {
            return 0;
        }
        
        if (memo[i][amount] != -1) {
            return memo[i][amount];
        }
        
        //This will remove unnecessary call
        if(coins[i] > amount) {
            return memo[i][amount] = numberOfWays(coins, i + 1, amount);
        }

        int take = numberOfWays(coins, i, amount - coins[i]);
        int skip = numberOfWays(coins, i + 1, amount);
        
        return memo[i][amount] = take+skip;
    }

    public int change(int amount, int[] coins) {
        n = coins.length;
        memo = new int[coins.length][amount + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return numberOfWays(coins, 0, amount);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 30;

        int coins2[] = {2,7,5,3,6};

        coinChange obj = new coinChange();
        System.out.println(obj.change(amount, coins));

        System.out.println(obj.change(20, coins2));
    }
}
