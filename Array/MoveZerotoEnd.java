// // My code
// public class MoveZerotoEnd {

//      public static void Move(int[] arr) {
//         int n = arr.length; // 7
        
//         // if length of array 0
//         if(n==0){
//             System.out.println("arr can't be zero length");
//             return;
//         }

//         for (int i = 0; i < arr.length; i++) {
//             Rotate(arr, n);
//         }


//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
        
//     }

//     public static void Rotate(int[] arr, int n) {
//         for (int i = 1; i<n; i++) {
//             int temp;   
//             if(arr[i-1]==0){
//                 temp = arr[i-1]; // temp = 0 
//                 arr[i-1] = arr[i]; // arr[i-1] = 1
//                 arr[i] = temp;  // arr[i] = 0
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,0,0,0,0,4,1}; // output = 1,2,1,4,0,0,0
//         Move(arr);
//     }   
// }



public class MoveZerotoEnd {

     public static void Move(int[] arr) {
        // if length of array 0
        if (arr == null || arr.length == 0) return;

        // inital position
        int start = 0;

        // move forward all non zero element if n!=0
        // here int num: arr directly store array values one by one without index
        for(int num: arr){
            if(num!=0){
                arr[start++] = num;
            }
        }

        // now printing remaining zeroes
        while (start<arr.length) {
            arr[start++] = 0;
        }


        
    }


    public static void main(String[] args) {
        int arr[] = {0,1,0,3,2}; // output = 1,2,1,4,0,0,0
        Move(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }   
}


