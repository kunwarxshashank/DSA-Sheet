
/*public class MaxInArr{


    static int findMax(int[] arr, int n){

        // base case
        if(n==0){
            return arr[0];
        }

        int ans = findMax(arr, n-1); // arr, 1
        return Math.max(ans, arr[n]);
        
    }


    public static void main(String[] args) {
        int arr[] = {3,4,10,8,9};
        int n = arr.length-1; // 4
        int ans = findMax(arr, n);
       

        System.out.println(ans);
    }
}
*/


public class MaxInArr{


    static int findMax(int[] arr, int i){

        // base case
        if(i==arr.length-1){
            return arr[arr.length-1];  // 9
        }

        int ans = findMax(arr, i+1); // arr, 1
        return Math.max(ans, arr[i]);
        
    }


    public static void main(String[] args) {
        int arr[] = {3,4,10,8,9};
        int ans = findMax(arr, 0);
       

        System.out.println(ans);
    }
}