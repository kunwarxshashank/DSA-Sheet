import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary {

    public static int BinarySearch(int arr[], int n){
        //                            0  1  2  3  4  5  6  7  8
        // Applying Binary search on {10,14,15,20,21,26,27,29,41}
        // To find search = 29;

        // step 1: Find the length and find out mid value;
        // Assuming left = 0 & right = last array
        int left = 0;
        int right = arr.length-1; // 8
        int search = 41;

        // Here we go for left <=right in best case left and right are in same place 1st loop
        while (left<=right) { // 1. left = 0, right = 8, 2. left = 5 right = 8, left = 6, left = 7, left =8

            // int mid = (left+right)/2; // [Here it gives error on max, 
            // assuming left = INT.MAX and right = INT.MAX, then left+right can't be stored into integer as it overflow int.max
            // we use 
            int mid = left+(right-left)/2;


            if(arr[mid]==search){   // 21 = 41 X
                return mid;
            }else if(arr[mid]<search){  // 21<41
                left = mid+1;   // Now array become [26,27,29,41]
            }else if(arr[mid]>search){  
                right = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // to perform binary operation we need to first sort

        int arr[] = {10,14,15,20,21,26,27,29,41};
        int n = arr.length;
        int result = BinarySearch(arr, n);
        System.out.println(result);

    }

}
