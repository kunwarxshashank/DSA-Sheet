/*
public class MaxSumofSubArrK {

    public static int maxSum(int arr[], int k) {
        int n = arr.length; // 7
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int count = 0;

        // first find first window value time complexity = O(k)
        while (count < k ) {
            sum += arr[count];
            count++;
        }
        maxsum = sum;

        // ab remaining windows me first qindows ka (sum) store krenge = > sum of first 3 no.
        // use (sum) me se uski i-1 value minus krenge aur i+k-1 value plus krenge to 2,3,4 ka ho jaega
        for (int i = 1; i < n-k+1; i++) {
            int prev = arr[i-1]; // 1-1 = 0 => 10
            int next = arr[i+k-1]; // 1+3-1 = 3 => 200
            sum = sum-prev+next; // 70-10+200
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }


    public static void main(String[] args) {
        int arr[] = {10,20,40,200,10,60,300};
        int k = 3;
        int result = maxSum(arr, k);
        System.out.println(result);
    }
}
*/
public class MaxSumofSubArrK {

    public static int maxSum(int nums[]) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i-1],sum+nums[i]); // -2
            maxsum = Math.max(sum, maxsum); // -2
        }
        return maxsum;   

    }

    public static void main(String[] args) {
        int nums[] = {5,4,-1,7,8};
        int result = maxSum(nums);
        System.out.println(result);
    }
}
