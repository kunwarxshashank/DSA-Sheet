public class LeftRotateByOne {

    public static int Rotate(int[] arr) {
        int n = arr.length;

        // iterate array i = 1 to n;
        // arr[i-1] = arr[i];
        // arr[k] = arr[i]

        int first = arr[0];
        
        for (int i = 1; i < n; i++) { // i=1 => 0=20
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = first;


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int k = Rotate(arr);

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }

    }
}
