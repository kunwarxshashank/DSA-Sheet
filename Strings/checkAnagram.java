import java.util.HashMap;

public class checkAnagram {
    // string s ko map krenge aur count krenge
    // ki each char kitne baar aye h
    // agar dono string ke char equal hai then anagram

    /*
     * public static boolean anagram(String s, String t) {
     * // check yadi str ki length kam hai
     * if (s.length() != t.length() || s.length() < 1)
     * return false;
     * 
     * HashMap<Character, Integer> map = new HashMap<>();
     * HashMap<Character, Integer> map2 = new HashMap<>();
     * 
     * // count character for s and t
     * for (int i = 0; i < s.length(); i++) {
     * map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
     * map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
     * }
     * 
     * // check char count for both string
     * // /*
     * // * for (int i = 0; i < s.length(); i++) {
     * // * ❌ BUG #2 (Logic error in comparison loop)
     * // * if(map.get(s.charAt(i))!=map2.get(s.charAt(i))){
     * // * return false;
     * // * }
     * // * }
     * // *
     * // * Why this is risky ⚠️
     * // * map2.get(s.charAt(i)) can be null
     * // * Comparing Integer != Integer uses reference comparison, not value
     * comparison
     * // * Can cause NullPointerException
     * // *
     * //
     * 
     * System.out.println(map.get('z'));
     * 
     * for (char ch : map.keySet()) {
     * if (!map.get(ch).equals(map2.get(ch)))
     * return false;
     * }
     * 
     * return true;
     * }
     */

    /*
    
     public static boolean anagram(String s, String t) {
        // check string length
        if (s.length() != t.length() || s.length() < 1)
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        // check count of s
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // now ab t string me jitne v character aenge uski count minus krdenge
        for (char ch : t.toCharArray()) {
            // if map me koi key nhi bachi
            if (!map.containsKey(ch))
                return false;

            map.put(ch, map.get(ch) - 1);

            // if char count become zero then remove it
            if (map.get(ch) == 0)
                map.remove(ch);

        }
        return true;
    } 
    */


    // optimal

    public static boolean anagram(String s, String t) {

        // check string length
        if (s.length() != t.length() || s.length() < 1)
            return false;
        
        // convert string to char Array
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        // sort the array
        java.util.Arrays.sort(ch1);
        java.util.Arrays.sort(ch2);

        // check if every char of string match with string s and string t
        for (int i = 0; i < ch1.length; i++) {
            System.out.println(ch1[i]);
            System.out.println(ch2[i]);
            if(ch1[i]!=ch2[i])
                return false;
        }
        
        return true;
    }
    

    public static void main(String[] args) {
        String s = "RULES";
        String t = "LURES";
        boolean result = anagram(s, t);
        System.out.println(result);
    }
}
