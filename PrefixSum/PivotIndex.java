public class PivotIndex {
    public static int printPivot(int arr[]) {

        int n = arr.length;
        int[] Prefix = new int[n];
        int[] Suffix = new int[n];

        Suffix[n-1] = arr[n-1];

        for(int i=1; i<arr.length; i++){
            Prefix[i] = Prefix[i-1]+arr[i-1];
        }


        for(int i=n-2; i>=0; i--){
            Suffix[i] = Suffix[i+1]+arr[i];
        }
        


        for (int i = 0; i < arr.length; i++) {
            if(Suffix[i]==Prefix[i]){
                return i;
            }
        }

        return -1;   
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.out.println(printPivot(arr));
    }
}
