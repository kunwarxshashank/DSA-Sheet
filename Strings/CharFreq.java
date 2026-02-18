
import java.util.HashMap;
import java.util.Map;

public class CharFreq {

    
/* 
    public static int checkFreq(String str) {

        // step1: converting string to array
        char[] carr = str.toCharArray();

        // step2: now creating an array of 26 char representing from a-z;
        // each index represents eaach alphabet

        int[] arr = new int[26]; // [0, 0, 0, 0, 0, ......]
        
        // step3 looping
        for (char ch: carr) {

            // step 4: yaha pe har char ascii me convert hoga 
            // e.g "h" => 104; 104-97 = 7 to ye arr[7] ki value ko ++ increment karega
            // by default sabhi array ki value 0 rhega 
            // jab koi bhi element aaega to uski value 1 se increment hogi

            arr[ch-'a']++;

        }

        return 0;
    }

*/


    public static Map<Character, Integer> checkFreq(String str) {

        // step1: creating hashmap of it;
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        // step2: 
        return map;
    }

    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> result = checkFreq(str);
        System.out.println(result);
    }

}
