import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    /* BRUTE FORCE
    public static boolean checkTwoSum(int arr[], int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (i!=j && arr[i] + arr[j] == k) {
                    
                    return true;
                }
            }
        }
        return false;

    }
    */

    /* HASHMAP

    public static boolean checkTwoSum(int arr[], int k) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int val: arr){
            int complement = k-val; // 11 - 2 => 9; 11-6 => 5; 11-5 => 6; 11-8 => 3; 11-11 => 0;

            if(map.containsKey(complement)){
                return true;
            }

            map.put(val, 1); // {2,6,5,3}
        }

        return false;
    }
    */

    /*
    // using the greedy approach
    public static boolean checkTwoSum(int arr[], int k) {
        
        // step 1: firstly sort the array
        // step 2: left = 0; right = arr.length-1;
        // step 3: sum = arr[left]+arr[right]; 
        // step 4: if(sum==k) return true,
        // step 5: else if(sum<k) left ++
        // step 6: else if(sum>k) right --

        // Sort the array based on the value, not index
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1; // 4
        int sum = 0;

        if(arr.length<2){
            System.out.println("Array length less than 2");
            return false;
        }

        while (left<right) {
            sum = arr[left]+arr[right]; // 13
            if(sum==k){
                return true;
            }else if(sum<k){
                left ++;
            }else if(sum>k){
                right--;
            }
         }

        return false;
    }    
    */

       public static boolean checkTwoSum(int arr[], int k) {
       
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1; // 4
        int sum = 0;

        if(arr.length<2){
            System.out.println("Array length less than 2");
            return false;
        }

        while (left<right) {
            sum = arr[left]+arr[right]; // 13
            if(sum==k){
                return true;
            }else if(sum<k){
                left ++;
            }else if(sum>k){
                right--;
            }
         }

        return false;
    }    

    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 }; // {2,5,6,8,11}
        int k = 12;
        boolean result = checkTwoSum(arr, k);
        System.out.println(result);
    }
}
