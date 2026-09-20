
/*
class Solution {
    public int houseRob(int [] arr, int n, int i, int free, int dp[][] ){
        // base case 
        // jab house khtm ho jae
        if(i==n){
            return 0;
        }

        // dp ki value return krni h
        if(dp[i][free] != -1){
            return dp[i][free];
        }

        // agar house free na ho already rob krchuke ho
        // simply agle ghar me chle jaenge
        if(free==0){ 
            return dp[i][free] = houseRob(arr, n, i+1, 1, dp);
        }

        // agar ghar free ho to usme 2 case aenge
        // case1: is ghar ko rob krle aur age badh jae, arr[i] add krdenge
        // case2: ghar ko chhod ke dusre ghar par jate h

        int case1 = arr[i]+houseRob(arr, n, i+1, 0, dp);
        int case2 = houseRob(arr, n, i+1, 1, dp);
        return  dp[i][free] = Math.max(case1, case2);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int i = 0; int free = 1;

        int dp[][] = new int[n][2];

        for(int j=0; j<n; j++){
            dp[j][0] = -1;
            dp[j][1] = -1;
        }

        return houseRob(nums, n, i, free, dp);
    }
}
*/

class Solution {
    public int HouseRobber(int arr[], int[] dp, int n, int i ){
        // 2. Transition:-
        /*
            house robber me 2 transition hai har state
            1. CanRob => we just simply add profit of each house and increase i
            2. CantRob => we skip house, and increase house;
        */

        // 3. Base case
        // No houses left
        if (i >= n) {
            return 0;
        }


        // if exist in dp
        if(dp[i]!=-1){
            return dp[i];
        }

        int canrob = arr[i]+HouseRobber(arr, dp, n, i+2);
        int cantrob = HouseRobber(arr, dp, n, i+1);

        return dp[i] = Math.max(canrob, cantrob);
        
    }

    public int rob(int[] nums) {
        int n = nums.length;

        // state => those who are changing, yaha pe sirf i change ho rha hai isliye 
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        return HouseRobber(nums, dp, n, 0);
    }
}