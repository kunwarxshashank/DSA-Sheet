public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        Sort(arr, 6);
    }

    public static void Sort(int arr[], int n){
        for(int i=0; i<n; i++){
            int temp =0;

            for(int j=i; j<n; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // priting
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}

// 13 46 24 52 20 9   // 0 
// 13 24 46 52 20 9
// 13 24 46 20 52 9
// 13 24 20 46 52 9
// 13 20 24 46 52 9
// 13 20 24 46 9 52
// 13 20 24 9 46 52
// 13 20 9 24 46 52
// 13 9 20 24 46 52
// 9 13 20 24 46 52



/*
 1. int arr[] = { 13, 46, 24, 52, 20, 9 };
 2. Select an element assuming 13, Place in Left (Sorted Part).
 3. Inner Loop shifts element using swapping
 4. Outer Loop at Index 0 = 13, is assuming sorted since no values in left side
 5. Outer loop iteration 2(selected index i = 1):
 6. Inner Loop index = 2 = 24, 
 */