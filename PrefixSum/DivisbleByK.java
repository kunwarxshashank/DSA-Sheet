import java.util.HashMap;

public class DivisbleByK{

    public static int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int res = 0;
        map.put(0,1);
        
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

            // if(sum%k==0) yaha pe hum ye isliye nahi use krte kyunki, isme subarray 0 se start hoga 
            // sirf uske liye hai, balki subarr to khi se v start ho skta hai.

            int need = (sum%k);

            // Handle negative remainder
            if (need < 0) {
                need += k;
            }

            if(map.containsKey(need)){
                res += map.get(need);
            }
            map.put(need, map.getOrDefault(need, 0)+1);
        }
        return res;
    }    

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(subarraysDivByK(arr, 3));

    }
}