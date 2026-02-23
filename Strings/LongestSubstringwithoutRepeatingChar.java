import java.util.HashMap;

public class LongestSubstringwithoutRepeatingChar {

    /* ---------------SLIDING WINDOW ----------------------
    public static int longestSubstring(String s) {
        int low = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1); // p - 1; w - 2

            System.out.println(low + " " + high);
            System.out.println(map);
            

            while (map.get(ch) > 1) {
                char leftchar = s.charAt(low); // p
                map.put(leftchar, map.get(leftchar) - 1); // ww
                low++; // low = 1
            }

            max = Math.max(max, high - low + 1); // 1 // 2

        }
        return max;
    }
    
    
    */

    /*
        ------------------OPTIMAL ------------------------
    */
    public static int longestSubstring(String s) {
        int low = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high); // p w 

            // kya character contains hai map
            // initally koi v character contain nhi hoga
            // character contains tabhi hoga jab repeat hoga

            if(map.containsKey(ch)){
                low = Math.max(low, map.get(ch)+1);
            }

            map.put(ch, high);

            max = Math.max(max, high-low+1);


        }
        return max;
    }

    public static void main(String[] args) {
        String s = "pwwkew"; // 3
        System.out.println(longestSubstring(s));

    }
}
