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
    public static void main(String[] args) {
        int arr[] = {1,-1,3,-2,6};
        System.out.println(maxSumofSubArr(arr));
    }
}
