public class CellinSortedArr {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 8, 10, 11, 12, 19 };

        int arr2[] = { 1, 2, 8, 10, 11, 12, 19 };
        int x = 0;
        
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = high+1;
            }
        }
        System.out.println(ans);
    }
}
