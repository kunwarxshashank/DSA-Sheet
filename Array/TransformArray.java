public class TransformArray {

    static void Double(int arr[], int n) {
        // print double of each array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] * 2);
        }
    }

    static void Conditional(int arr[], int n) {
        // replace all negative numbe with 0

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

    static void newArray(int arr[], int n) {
        // create a newarray with double of previous array
        int arrn[] = new int[n];

        for (int i = 0; i < n; i++) {
            arrn[i] = arr[i] * arr[i];
            System.out.println(arrn[i]);
        }
    }

    static void EvenArray(int arr[], int n) {
        // print array of even value only
        int count = 0;
        
        // count array of length that is even
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                count ++;
            }
        }

        // now create array oflength count 
        int arr2[] = new int[count];

        int x = 0;
        // now enter all even values in arr2
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                arr2[x]=arr[i];
                x++;
            }
        }

        // print all array
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
        
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        // Double(arr, n);
        // Conditional(arr, n);
        // newArray(arr, n);
        EvenArray(arr, n);

    }
}
