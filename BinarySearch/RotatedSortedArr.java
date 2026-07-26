/*
LEETCODE 33
*/

import java.util.Arrays;
class Solution {
    public int search(int[] arr, int target) {
        int low = 0;
        int n = arr.length;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target)
                return mid;

            // part 1 arr[4,5,6,7]
            if(arr[mid]>arr[n-1]){

                if(arr[mid]<target){
                    // right jao
                    low = mid+1;
                }else {
                    // arr[mid]>=target

                    // to yahan right aur left dono side ja skta hai
                    // isliye yaha arr[0] se compare krke check krenge

                    if(arr[0]>target){
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }
            }

            // part 2 arr[0,1,2]
            else{

                if(arr[mid]>target){
                    high = mid-1;
                }else{
                    // arr[mid]<target
                    // mid se bade dono side me hai left and right isliye dono side ////check krna hoga, par yaha arr[n-1] se check krenge

                    if(arr[arr.length-1]<target){
                        // agar target last value se bada hai to left move krenge
                        high = mid-1;
                    }else{
                        // arr[n-1] > target
                        // agar target last value se chhota hai to right move krenge
                        low = mid+1;
                    }

                    
                }
            }
        }
        return -1;
    }
}