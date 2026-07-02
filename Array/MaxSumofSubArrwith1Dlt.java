public class MaxSumofSubArrwith1Dlt {
    public static int maxSum(int arr[]) {
        int nodelete = arr[0];
        int onedelete = 0;
        int res = arr[0];

        for(int i=1; i<arr.length; i++){
            int prevnodelete = nodelete;
            nodelete = Math.max(arr[i], prevnodelete+arr[i]); // 1 -1 3
            onedelete = Math.max(prevnodelete, onedelete+arr[i]); // 1 -1 
            res = Math.max(res, Math.max(nodelete, onedelete)); // 1 1
        }
        
        
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,-2,3};
        System.out.println(maxSum(arr));
    }
}
