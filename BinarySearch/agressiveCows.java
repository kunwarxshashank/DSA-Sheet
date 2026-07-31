import java.util.*;
class Solution {
    
    public boolean findDistance(int[] arr, int k, int mid){
        int pos = 0;
        int count = 1;
        int i = 0;
        
        // k baar tak check krunga ki distance
        // 3 se badi hai
        
        while(count<k && pos<arr.length-1){
            if(Math.abs(arr[i]-arr[pos+1])<mid){
                pos++;
            }else{
                // agar distance badi hogi to
                // cow ka dusra khoonta dhudo
                pos++;
                i = pos;
                count++;
            }
            
        }
        
        if(count == k){
            return true;
        }else{
            return false;
        }
        
    }
    
    public int aggressiveCows(int[] arr, int k) {
        
        // code here
        // code here
        
        int low = 0;
        int high = arr[arr.length - 1] - arr[0];
        int ans = 0;
        Arrays.sort(arr);
        while(low<=high){
            int mid = low+(high-low)/2;
            boolean isFound = findDistance(arr, k, mid);
            if(isFound){
                ans = mid;
                low = mid+1; // try larger distance
            }else{
                high = mid-1;
            }            
        }
        return ans;
        
    }
}