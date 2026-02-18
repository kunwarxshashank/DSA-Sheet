// public class SecondLargestElement {
//     public static void main(String[] args) {
//         int arr[] = {10,20,55,24,76};
//         int n = arr.length-1;
//         int max = 0;
//         int secondmax = 0;
        
//         if(n<2){
//             System.out.println("Array length not possible");
//         }

//         for(int i=0; i<=n; i++){
//             secondmax = max;
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }

//         System.out.println(secondmax);
//     }
// }


public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {50, 40, 45};
        int n = arr.length-1;

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        
        if(n<2){
            System.out.println("Array length not possible");
        }

        for(int i=0; i<=n; i++){
            if(arr[i]>max){
                secondmax = max; // -214
                max = arr[i]; // 50
            }else if(arr[i]>secondmax && arr[i] !=max){
                secondmax = arr[i];
            }
        }

        System.out.println(secondmax);
    }
}
