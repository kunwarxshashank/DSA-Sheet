import java.util.*;
public class TwoSum {

    
    public static int[] checkTwoSum(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], null)
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 4, 5};
        int target = 10;

        System.out.println(checkTwoSum(arr));
    }
}
