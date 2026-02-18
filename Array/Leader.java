// public class Leader {
//     public static void main(String[] args) {
//         int arr[] = { 16, 17, 4, 3, 5, 2 };
//         int n = 6;

//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i + 1; j < n; j++) {
//                 sum = sum + arr[j];
//                 System.out.println("sum is: " + sum);
//             }
//             if (arr[i] >= sum) {
//                 System.out.println(arr[i]);
//             }
//         }

//     }
// }

public class Leader {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    break;
                }
            }
            if (j == n) {
                System.out.println(arr[i]);
            }
        }
    }
}
