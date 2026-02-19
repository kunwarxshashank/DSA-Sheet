public class MinSizeSubArrSum {

    /*-----------BRUTEFORCE-------------
    public static int minSize(int arr[], int target) {
    
        int min = Integer.MAX_VALUE;
    
        for (int i = 0; i < arr.length; i++) {
    
            int sum = 0;
            int count = 0;
    
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if (sum >= target) {
                    min = Math.min(min, count);
                    break;
                }
            }
        }
    
        // Here we don't return Integer.MAX_VALUE; so we have to change it to 0
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    
    */
    public static int minSize(int arr[], int target) {
        int low = 0; 
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int n = arr.length; // 5

        
        for (int high = 0; high < arr.length; high++) {
            sum += arr[high]; // 8 2 11

            // agar sum bada hoga target se to remove kro window se element
            while (sum>=target) {
                min = Math.min(min, high-low+1);
                sum -= arr[low];
                low++;
            }
        }

        // Here we don't return Integer.MAX_VALUE; so we have to change it to 0
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 1, 8, 10 }; // output => 2 {4,3}
        int target = 11;
        System.out.println(minSize(arr, target));
    }
}
