class Solution {
    
    public static boolean subSet(int arr[], int n, int i, int sum, int dp[][]){

        
        if(sum == 0){
            return true;
        }
        
        if(i>=n){
            return false;
        }
        
        if(arr[i] > sum){
            return subSet(arr, n, i+1, sum, dp);
        }
        
        if(dp[i][sum]!=-1){
            return dp[i][sum] == 1;
        }
        
        boolean take = subSet(arr, n, i+1, sum-arr[i], dp);
        // skip 
        boolean skip = subSet(arr, n, i+1, sum, dp);
        
        boolean result = take || skip;
        
         
        dp[i][sum] = result ? 1: 0;
        
        return result;
        
    }
    
    
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        
        return subSet(arr, n, 0, sum, dp);
    }
}