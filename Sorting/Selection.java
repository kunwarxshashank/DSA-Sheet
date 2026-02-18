public class Selection {
    public static void Sort(int arr[], int n) {
        // int arr[] = { 13, 46, 24, 52, 20, 9 };
        
        for(int i=0; i<n; i++){
            int min = i; // 0
            int temp = 0;

            for(int j=i; j<n; j++){
                // Finds minimum index
                if(arr[min]>arr[j]){
                    min = j; // min = 5
                }
                // Now swap that values
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }


        System.out.println("");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }


    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = 6;
        Sort(arr, n);
    }
}

/*
 * 1. Here i have to find smallest values in array
 * 2. Now swap first and last value
 * 
 */




