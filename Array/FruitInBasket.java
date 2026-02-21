import java.util.HashMap;

public class FruitInBasket {
    public static int totalFruit(int[] arr) {
        int left = 0;
        int max = 0;
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int high = 0; high < arr.length; high++) {

            // frequency count krlo
            map.put(arr[high], map.getOrDefault(arr[high], 0) + 1); // 1-2

            while (map.size() > k) {
                // sliding the window toward left
                map.put(arr[left], map.get(arr[left]) - 1);

                // agar window me element na rhe to remove kr do
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            // Always update for valid window
            max = Math.max(max, high - left + 1);


        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1};
        System.out.println(totalFruit(arr));
    }
}
