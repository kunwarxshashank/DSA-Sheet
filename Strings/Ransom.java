import java.util.*;
/*


class Ransom{
    public static boolean checkRansom(String str1, String str2) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "aaab";
        String str2 =  "aab";
        System.out.println(checkRansom(str1, str2));
    }
}


*/

class Ransom {

    public static boolean checkRansom(String ransomNote, String magazine) {

        // if ransomNote can be made by using the ch from magazine and false otherwise.
        HashMap<Character, Integer> map = new HashMap();

        // count freq
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1); // a-2, b-1
        }

        // now check if all charcters of ransomin magzine
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }

            // remove frequency
            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) == 0)
                map.remove(ch);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(checkRansom(ransomNote, magazine));

    }
}