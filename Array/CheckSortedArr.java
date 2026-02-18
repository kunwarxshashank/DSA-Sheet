public class CheckSortedArr {

    public static Boolean CheckSort(int arr[], int n) {
        Boolean sorted;

        if(n<1){
            System.out.println("array length can't be less than 1");
        }
        
        for (int i = 1; i <n; i++) {
            if (arr[i-1] <= arr[i]) {
                sorted = true;
            } else {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int n = arr.length;

        Boolean result = CheckSort(arr, n);
        System.out.println(result);

    }
}
