/*
        // int j = 0;
        // int min = -1;
        // int max = -1;

        // while (j < nums.length) {

        // if (nums[j] < goal) {
        // j++;
        // } else if (nums[j] == goal) {
        // if (min == -1)
        // min = j;
        // max = Math.max(max, j);
        // j++;
        // }else{
        // // if nums[j]>goal
        // break;
        // }
        // }

        // System.out.println("min: " + min + " max: " + max);
        // }

*/

public class FirstandLast {

    public static int checkPrev(int [] arr, int mid, int goal) {
        if(mid>0 && arr[mid-1]==goal){
            return checkPrev(arr, mid-1, goal);
        }
        return mid;
    }
    
    public static int checkNext(int [] arr, int mid, int goal) {
        
        if(mid<arr.length-1 && arr[mid+1]==goal){
            return checkNext(arr, mid+1, goal);
        }
        return mid;
    }


    
    public static void main(String[] args) {

        int arr[] = { 5, 7, 7, 8,8,8, 8, 10 };
        int goal = 8;
        int low = 0;
        int high = arr.length - 1;
        int min = -1;
        int max = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            System.out.println(mid);

            if (arr[mid] == goal) {
                // chck prev and next
                min = checkPrev(arr, mid, goal);
                max = checkNext(arr, mid, goal);
                break;
            } else if (arr[mid] > goal) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(new int[] {min, max}); 

    }
}
