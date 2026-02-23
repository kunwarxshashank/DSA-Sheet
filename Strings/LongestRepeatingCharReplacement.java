import java.util.HashMap;

public class LongestRepeatingCharReplacement {

    public static int repatingChar(String s, int k) {
        int low = 0;
        int maxlen = 0;
        int maxfreq = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);
            
            // count frequency
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // maximum frequency kya h char ki
            maxfreq = Math.max(maxfreq, map.get(ch));

            // get window size
            int windowsize = high - low + 1;

            // jab tak window k se bada hai tab tak window invalid rhegi tab tak window
            // slide krenge
            while (windowsize - maxfreq > k) {
                char leftch = s.charAt(low);
                // decrease low
                map.put(leftch, map.get(leftch) - 1);
                low++;
                windowsize = high - low + 1;
                
            }

            maxlen = Math.max(maxlen, high - low + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "AABABBA"; // output: 4
        int k = 1;
        System.out.println(repatingChar(s, k));

    }
}