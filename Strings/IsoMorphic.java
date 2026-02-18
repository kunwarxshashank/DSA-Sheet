import java.util.HashMap;

public class IsoMorphic {

// getOrDefault(Object key, V defaultValue)
// 👉 It returns:
// the value mapped to the key, if the key exists
// otherwise, it returns the default value you provide

    public static Boolean checkIsomorphic (String str1, String str2) {
        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i); // p
            char c2 = str2.charAt(i); // t

            if(map1.containsKey(c1)){
                if(map1.get(c1)!=c2) return false;
            }else{
                map1.put(c1,c2);
            }

            if(map2.containsKey(c2)){
                if(map2.get(c2)!=c1) return false;
            }else{
                map2.put(c2, c1);
            }
            
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "ab";
        String str2  = "aa";

        Boolean result = checkIsomorphic(str1,str2);
        System.out.println(result);
    }
}
