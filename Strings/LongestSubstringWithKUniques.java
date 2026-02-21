import java.util.HashMap;

public class LongestSubstringWithKUniques {

    public static int longestSubstringWithKUniques(String s, int k) {

        int max = Integer.MIN_VALUE;
        int low = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            // store frequency of each charaaacter
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // tab tak window shrink karo jab map.size > k
            while (map.size() > k) {
                char lowchar = s.charAt(low); //

                // character ki frequency remove kr rha hai
                map.put(lowchar, map.get(lowchar) - 1);

                // if map is empty
                if (map.get(lowchar) == 0) {
                    map.remove(lowchar);
                }
                low++;
            }

            if (map.size() == k) {
                // update only when valid
                max = Math.max(max, high - low + 1);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 2;

        System.out.println(longestSubstringWithKUniques(str, k));
    }
}
