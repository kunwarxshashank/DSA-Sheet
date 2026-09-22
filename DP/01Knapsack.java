import java.util.*;
class Solution {
    
    public int maxKnap(int val[], int wt[], int i, int n, int cap, int[][] dp){
        
        // base case
        if(i==n) return 0;
        
        // agar dp already calculated
        if(dp[i][cap]!= -1){
            return dp[i][cap];
        }

        // if weight > knapsack we will not include it
        if(wt[i]>cap){
            return dp[i][cap] = maxKnap(val, wt, i+1, n, cap, dp);
        }
        
        // agar weight < knapsack 
        // value ko include krenge
        int yes = val[i]+maxKnap(val, wt, i+1, n, cap-wt[i], dp);
        // agar include na kre 
        int no = maxKnap(val, wt, i+1, n, cap, dp);
        // inme se jo maximum hoga use return krna h
        
        
        return dp[i
][cap] = Math.max(yes, no);
    }
    
    
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        // base case
        int n = val.length;
        
        // dp[i][cap]
        // i = current item
        // cap = current capacity
        
        int dp[][] = new int[n][W+1];
        
        // -1 means this state has not been calculated yet
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return maxKnap(val, wt, 0, n, W, dp);
    }
}
