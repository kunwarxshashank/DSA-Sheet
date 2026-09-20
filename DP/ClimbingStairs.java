class Solution {
    /*
    HashMap<Integer, Integer> dp = new HashMap<>();
    public int Stairs(int i, int n){

        // base case agar destination pe hi ho to 1 way
        if(i==n){
            return 1;
        }

        if(i>n){
            return 0;
        }

        // agar element already exist ho
        if(dp.containsKey(i)){
            return dp.get(i);
        }

        int ans = Stairs(i+1, n)+Stairs(i+2, n);
        dp.put(i, ans);
        return ans;

    }

    public int climbStairs(int n) {
        int i = 0;
        int ans =  Stairs(i, n);
        return ans;
    }

    */

    HashMap<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }
        
        if(map.containsKey(n)){
            return map.get(n);
        }

        int ans = climbStairs(n-1)+climbStairs(n-2);
        map.put(n, ans);
        return ans;
        
    }
}