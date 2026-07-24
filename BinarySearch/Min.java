public class Min {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int goal = 10;
        int low = 0;
        int high = arr.length-1;

        System.out.println("oo");
        

        while (low<=high) {
            int mid =  (high-low)+low/2; // 3
            System.out.println(mid);
            if(arr[mid]==goal){
                System.out.println(mid);
                break;
            }else if(arr[mid]<goal){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(-1);
    }
}
