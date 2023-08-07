package DynamicProgramming;

public class UnboundedKnapsack {

}

// 322. Coin Change Leetcode
// Link = https://leetcode.com/problems/coin-change/

class Solution1 {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Integer[][] dp = new Integer[n+1][amount+1];
        int res = recursion(coins, amount, n,dp);
        
        return (res == Integer.MAX_VALUE-1) ? -1 : res;
        
    }
    public int recursion(int[] coins,int amount,int n,Integer[][] dp)
    {
        if(n == 0 && amount > 0)
        {
            return Integer.MAX_VALUE-1;
        }
        if(amount == 0)
            return 0;
        
        if(dp[n][amount] != null)
            return dp[n][amount];
        
        int res = 0;
        
        if(coins[n-1] > amount)
            return dp[n][amount] = recursion(coins,amount,n-1,dp);
        else
        {
            return dp[n][amount] = Math.min(recursion(coins,amount,n-1,dp), 
                           recursion(coins,amount - coins[n-1],n,dp) + 1);
        }
    }
}