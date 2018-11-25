package com.geekerstar.s322;

import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return 0;
        }
        int[] minimum = new int[amount + 1];
        Arrays.fill(minimum, amount + 1);
        minimum[0] = 0;
        Arrays.sort(coins);
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length && coins[j] <= i; j++) {
                minimum[i] = Math.min(minimum[i], minimum[i - coins[j]] + 1);
            }
        }
        return minimum[amount] > amount ? -1 : minimum[amount];
    }
}
