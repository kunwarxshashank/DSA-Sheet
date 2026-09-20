class Solution {

    public int HouseRob(int nums[], int dp[], int n, int i){

        // base case
        if(i>=n){
            return 0;
        }

        if(dp[i]!=-1){
            return dp[i];
        }


        int rob = nums[i]+HouseRob(nums, dp, n, i+2);
        int skip = HouseRob(nums, dp, n, i+1);

        return dp[i] = Math.max(rob, skip);
    }



    public int rob(int[] nums) {
        // state: 
        int n = nums.length;
        int dp1[] = new int[n-1];
        int dp2[] = new int[n-1];

        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];

        for(int i=0; i<n-1; i++){
            arr1[i] = nums[i];
        }

        for(int i=1; i<n; i++){
            arr2[i-1] = nums[i];
        }


        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        if(n==1){
            return nums[0];
        }

        int house1 =  HouseRob(arr1, dp1, n-1, 0);
        int house2 =  HouseRob(arr2, dp2, n-1, 0);

        return Math.max(house1, house2);
    }
}