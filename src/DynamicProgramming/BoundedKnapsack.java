package DynamicProgramming;

public class BoundedKnapsack {
	public static void main(String[] args) {
		
	}

}

// 0 - 1 Knapsack Problem 
// Link = https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1/
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int[][] dp = new int[n+1][W+1];
        for(int i = 0; i < n + 1; i++)   
        for(int j = 0; j < W + 1; j++)   
            dp[i][j] = -1;    
        return recursion(W,wt,val,n,dp);
        
    } 
    static int recursion(int W, int wt[], int val[], int n,int[][] dp)
    {
        if(n == 0 || W == 0)
        {
            return 0;
        }
        if(dp[n][W] != -1)
            return dp[n][W];
        if(wt[n-1] > W)
        {
            dp[n][W] = recursion(W,wt,val,n-1,dp);
            return dp[n][W];
        }
        else
        {
            dp[n][W] = Math.max(val[n-1] + recursion(W - wt[n-1],wt,val,n-1,dp),
            recursion(W,wt,val,n-1,dp));
            return dp[n][W];
        }
        
    }
}