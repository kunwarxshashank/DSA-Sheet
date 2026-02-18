
public class ReverseArray {

    // This is swap function
    public static void Swap(int i, int j, int arr[]){
        int left = 0;
        left = arr[i];
        arr[i] = arr[j];
        arr[j] = left;
        
    }

    // This is reverse function
    public static void Reverse(int i, int j, int arr[]) {
        if(i>=j) return;    // Condition to stop swapping array means they overlap
        Swap(i, j, arr);    
        Reverse(i+1, j-1, arr);        
    }



    // This is main function
    public static void main(String[] args) {
        // Reverse Array Function
        int[] arr = {0,2,1,9,11,5};
        int n=5;
        Reverse(0, n-1, arr);
        for(int i=0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
