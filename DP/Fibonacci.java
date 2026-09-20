class Solution {
/*
    public int fib(int n) {
        // base case
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        // fib(2) = fib(1)+fib(0)

        int ans = fib(n-1)+fib(n-2);
        return ans; 
    }

*/
    // using D.P
    /*
    HashMap<Integer, Integer> map = new HashMap<>();
    public int fib(int n){

        // base case as it is likh dunga
        // yaha hum n=0, n=1 ko map me store isliye nahi kr rhe kyunki hume direct answer mil rha hai, koi operation krne ki jrurt nhi pd rhi hai
        if(n<=1)
            return n;
        
        // yaha agar element wo phle se store hai to to use return krdo
        // yani ki agar fib(2) call hua aur wo already map me hai to 
        // map se find krke return krdega to use aage solve krne ki jrurat nahi pdegi

        if (map.containsKey(n)) {
            return map.get(n);
        }

        int a1 = fib(n-1);
        int a2 = fib(n-2);
        int ans = a1+a2;

        map.put(n, ans);

        return ans;

    */


    // using tabulation
    HashMap<Integer, Integer> map = new HashMap<>();
    public int fib(int n){
        int arr[] = new int[3]; // 2

        if(n<2){
            return n;
        }

        int one = 0;
        int two = 1;
        

        for(int i=2; i<=n; i++){
            int prev = two;
            two = one+two;
            one = prev;
        }

        return two;
    
    }
}