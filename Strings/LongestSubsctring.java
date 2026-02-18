import java.util.HashSet;

public class LongestSubsctring {

    // length of longest substring 

    public static int lengthOfLongestSubstring(String s) {

        HashSet <Character> set = new HashSet<>();

        int left = 0;
        int max = 0;
        
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // agar already exist kr rhi hai value
            while (set.contains(ch)) {
                // remove previous left
                set.remove(s.charAt(left)); // a
                left++;
            }

            // add new character
            set.add(ch);

            max = Math.max(max, right-left+1);
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
