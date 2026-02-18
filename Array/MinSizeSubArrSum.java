public class MinSizeSubArrSum {

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

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 }; // output => 2 {4,3}
        int target = 9;
        System.out.println(minSize(arr, target));
    }
}
