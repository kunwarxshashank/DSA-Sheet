class MaxAbsSum{
    public static int findMaxAbs(int arr[]) {
        int cursum  = arr[0];
        int maxsum = arr[0];
        int newminsum = arr[0];
        int newcursum = arr[0];

        int minsum = arr[0];

        for(int i=1; i<arr.length; i++){
            int v1 = arr[i]; // -3 2 3
            
            cursum = Math.max(v1, cursum+arr[i]); // -2 2 5
            minsum = Math.min(v1, minsum+arr[i]); // -3 -1 2


            newminsum = Math.min(newminsum, minsum); // -3 -3 -3
            newcursum = Math.max(newcursum, cursum); // 1 2 5
            

            maxsum = Math.max(Math.abs(newminsum), Math.abs(newcursum)); // 3 3
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[] = {1,-3,2,3,-4};
        System.out.println(findMaxAbs(arr));
    }
}