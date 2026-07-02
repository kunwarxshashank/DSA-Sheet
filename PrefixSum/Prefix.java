class Prefix{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length; // 5
        int[] Suffix = new int[arr.length];

        Suffix[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--){
            Suffix[i] = Suffix[i+1]+arr[i];
        }


    }
}