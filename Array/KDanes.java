public class KDanes {
    public static int maxSumofSubArr(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : arr) {
            sum = num;

            if(sum>maxsum){
                maxsum = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return maxsum;

    }

     public static int KDanesMaxSum(int arr[]) {
        int cursum = arr[0];
        int maxsum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            cursum = Math.max(arr[i], arr[i]+cursum);
            maxsum = Math.max(maxsum,cursum);
        }

        return maxsum;
    }   

    public static int KDanesMaxProduct(int arr[]) {
        int cursum = arr[0];
        int maxsum = arr[0];
        int minimum = arr[0];

        for(int i=1; i<arr.length; i++){
            int v1 = arr[i]; // 3 -4
            int v2 = cursum*arr[i]; // -6 -12
            int v3 = minimum*arr[i]; // -6 24

            cursum = Math.max(v1, Math.max(v2, v3)); // 3 24
            minimum = Math.min(v1, Math.min(v2, v3)); // -6 -12
            maxsum = Math.max(maxsum, Math.max(minimum, cursum)); // 3
        }

        return maxsum;
    }
    
    public static void main(String[] args) {
        int arr[] = {-2,3,-4};
        // System.out.println(KDanesMaxSum(arr));
        System.out.println(KDanesMaxProduct(arr));
    }
}
