class PeakIndxinMountain{
    public static void main(String[] args) {
        int arr[] = {0,1,0};
        int ans  = 0;
        int low = 0;
        int high = arr.length-1;

        while (low<=high) {
            int mid = low+(high-low)/2;
            
            if(arr[mid]>arr[ans]){
                ans = Math.max(ans, mid);
                low = mid+1;
            }else{
                high = mid;
            }
        }
        System.out.println(ans);
    }
}