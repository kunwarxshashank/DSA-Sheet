class PeakIndxinMountain{
    public static void main(String[] args) {
        int arr[] = {0,1,0};
        int low = 0;
        int high = arr.length-1;

        // isme hum peak dhudhna hai turning point
        // to hum max na dhud ke ye find kre ki kaha pe turning ho rha hai

        while (low<high) {
            int mid = low+(high-low)/2;
            
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        System.out.println(high);
    }
}