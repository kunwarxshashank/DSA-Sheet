
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class MinimumWindowSubstring {

    /*
        ---------------O(N*M)--------------------
    public static boolean checkChar(HashMap<Character, Integer> map,
            HashMap<Character, Integer> need) {

        for (char ch : need.keySet()) {
            if (!map.containsKey(ch) || map.get(ch) < need.get(ch)) {
                return false;
            }
        }
        return true;
    }

    public static String checkString(String s, String t) {

        int minLen = Integer.MAX_VALUE;
        int low = 0;
        String substring = "";
        int startIndex = 0; // stores start of minimum window

        HashMap<Character, Integer> need = new HashMap<>();
        // count need frequency
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // create window
        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            // count freq of charcter
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (checkChar(map, need)) {

                // find window len
                int windowLen = high - low + 1; //

                // update only if smaller substring
                if (windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = low;
                }

                minLen = Math.min(minLen, high - low + 1); // 6
                substring = s.substring(low, high + 1);
                char leftch = s.charAt(low);
                map.put(leftch, map.get(leftch) - 1);
                if (map.get(leftch) == 0) {
                    map.remove(leftch);
                }
                low++;
            }

        }
        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(startIndex, startIndex + minLen);
    }

    */
    // FIXED: now checks frequency also




    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "CDE";

        System.out.println(checkString(s, t));
    }
}