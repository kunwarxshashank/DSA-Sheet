import java.util.*;

public class MajorityElement {
    public static int checkELement(int arr[], int n) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        // COUNT THE FREQUENCY

/*
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            max = Math.max(map.get(i), max);
        }
*/

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        System.out.println(map.toString());




        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 4, 1, 4, 2, 3, 4, 1 };
        int n = arr.length / 3;
        System.out.println(checkELement(arr, n));

    }
}
