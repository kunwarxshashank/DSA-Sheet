public class GenerateSubArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int n = arr.length;
        // Output = [1], [1,2], [1,2,3], [2], [2,3], [3]

        // print outer lines
        for(int i=0; i<n; i++){ 
            for(int j=i; j<n; j++){
                for(int k=j; k<n; k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }

    }
}

// output

/*
 * 
 * 1 > 1 > 1
 * 1 > 1 > 1 2
 * 1 > 1 > 1 2 3
 * 
 * 1
 * 12
 * 123
 * 2
 * 23
 * 3
 * 
 */