import java.util.*;
class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int i = 0;
        int j = arr.length-1;
        Arrays.sort(arr);
        int count = 0;

        while(i<=j){
            if(arr[i]+arr[j]<=limit){
                // count 1 vote and i and j ++
                i++;
                j--;
            }else{
                j--;
            }

        count++;
        }
        return count;
    }
}