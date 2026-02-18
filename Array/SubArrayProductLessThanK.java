import java.util.*;
// find no of triplets whose sum is less than given sum

public class SubArrayProductLessThanK {

    /*
     * public static List<List<Integer>> LessthanK(int arr[], int sum) {
     * // sort the array
     * Arrays.sort(arr);
     * 
     * // create a list to store the element
     * List<List<Integer>> list = new ArrayList<>();
     * 
     * for (int i = 0; i < arr.length - 2; i++) {
     * 
     * int left = i + 1;
     * int right = arr.length - 1;
     * 
     * if (i > 0 && arr[i] == arr[i - 1])
     * continue;
     * 
     * while (left < right) {
     * 
     * int totalsum = arr[i] + arr[left] + arr[right]; //
     * System.out.println(totalsum);
     * 
     * // skip duplicate values
     * while (left<right && arr[left]==arr[left-1])
     * left++;
     * 
     * while (left<right && arr[right]==arr[right-1])
     * right--;
     * 
     * 
     * 
     * if (totalsum < sum) {
     * list.add(Arrays.asList(arr[i], arr[left], arr[right]));
     * right--;
     * } else if (totalsum>sum) {
     * left++;
     * }
     * }
     * }
     * 
     * return list;
     * }
     */

    public static int LessthanK(int arr[], int sum) {
        // sort the array
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            // for unique triplets
            // if (i > 0 && arr[i] == arr[i - 1])
            //     continue;

            while (left < right) {

                int totalsum = arr[i] + arr[left] + arr[right];

                if (totalsum < sum) {
                    count = count + (right - left);
                    left++;
                } else {
                    right--;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 10,5,2,6 };
        int k = 2;
        System.out.println(LessthanK(arr, k));
    }
}