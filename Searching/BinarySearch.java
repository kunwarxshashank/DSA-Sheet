public class BinarySearch {

    public static int Search(int arr[], int n, int search) {
        int left = 0;
        int right = n;
 

        while (left<=right) {

            int mid = left+(right-left)/2; // arr[4] = 21; // arr[1] = 14 // arr[2] = 15

            // agar mid value hi search value ho to
            if(search==arr[mid]){
                return mid;
            }

            // agar search value arr[mid] se choti ho
            if(search<arr[mid]){
                right = mid-1;
            }

            // agar search value arr[mid] se badi ho to
            if(search>arr[mid]){
                left = mid+1;
            }
        }
        
        return -1;     
    }

    public static void main(String[] args) {
        int arr[] = {10,14,15,20,21,26,27,29,41};
        int n = arr.length - 1;
        int search = 55;
        int result = Search(arr, n, search);
        System.out.println(result);
    }
}