public class Bubble {
    public static void main(String[] args) {
        int arr[] = {9,4,3,11,2,6};
        Sort(arr, 6);
    }

    public static void Sort(int arr[], int n){
        for(int i=0; i<n; i++){
            int min = i;
            int temp = 0;
            for(int j=i; j<n; j++){
                if(arr[min]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                    System.out.println("temp: "+arr[min]);
                }
            }
        }

        // print array
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}


/*


LAP 1
 1. 9 4 3 11 2 6
 2. 4 9 3 11 2 6
 3. 4 3 9 11 2 6
 4. 4 3 9 2 11 6
 5. 4 3 9 2 6 11

LAP 2
 1. 3 4 9 2 6 11
 2. 3 4 9 2 6 11
 3. 3 4 2 9 6 11

 * 
 */