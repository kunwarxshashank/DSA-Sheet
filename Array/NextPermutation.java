import java.util.Arrays;

public class NextPermutation {

    public static void Permutation(int arr[], int index) {

        // step0: first sort the array to find permuatations
        // step1: find permuatations e.g [1,2,3] => [{1,2,3}, {1,3,2}, {2,1,3}, {2,3,1}, {3,1,2} {3,2,1}]

        // basecase
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // swap
            int temp = arr[index]; // temp    
            arr[index] = arr[i]; // arr[index]
            arr[i] = temp; // arr[i]     

            // recursion
            Permutation(arr, index + 1);


            // swap back
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
    }




    // 1,3,2 => 2,1,3   1,2,3 => 1,3,2  lower swap

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 }; // 1,3,2 
        int index = 0;
        Permutation(arr, index);
    }
}
