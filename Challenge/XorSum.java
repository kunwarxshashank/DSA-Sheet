import java.util.Scanner;

public class XorSum{

    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // length of array
        int n = sc.nextInt(); // 3
        
        // maximum xor 
        int k = sc.nextInt(); // 7

        // array
        int arr[] = new int[n]; // [1, 6, 3]
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // traverse till k
        int max = Integer.MIN_VALUE;
        
        for(int j=0; j<=k; j++){
            int val = 0;
            for(int x=0; x<n; x++){
                val += (j^arr[x]);
            }
            max = Math.max(val, max);
        }
        System.out.println(max);
    }
    */


    public static int findMax(int arr[], int k, int i){
        // base case
        if(i>k){
             return Integer.MIN_VALUE;
        }
        // Calculate XOR sum for current x
        int sum = 0;
        for (int num : arr) {
            sum += (i^num);
        }
        // bharosa rkho answer aa jaega
        int val = findMax(arr, k, i+1);
        // Return maximum
        return Math.max(sum, val);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // length of array
        int n = sc.nextInt(); // 3
        
        // maximum xor 
        int k = sc.nextInt(); // 7

        // array
        int arr[] = new int[n]; // [1, 6, 3]
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // find recurssion
        int res = findMax(arr, k, 0);
        System.out.println(res);
    }
}