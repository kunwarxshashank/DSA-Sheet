import java.util.HashMap;

public class countSubstring {

/*  *******BRUTEFORCE********
    public static int countSubStr(String s, int k) {
        int maxcount = 0;

        if(s.length()<k) return 0;

        // find all substring having length >= k;
        for (int i = 0; i < s.length(); i++) {

            HashMap <Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j); // p

                // count the frequency
                map.put(ch, map.getOrDefault(ch, 0)+1);

                // if map size become k then increase maxcount
                if(map.size()==k){
                    maxcount+=1;
                }

                // break if map size greator than k
                if(map.size()>k){
                    break;
                }
            }
        }

        return maxcount;
    }

*/
    public static int countSubStr(String s, int k) {
        int left = 0;
        int count = 0;

        HashMap <Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            // count the frequency 
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            // shrink window if map.size>k
            while(map.size()>k){
                char leftch = s.charAt(left);

                // reduce frequency of character by 1 if left character found again
                map.put(leftch, map.get(leftch)-1);

                // remove character if freq =0 
                if(map.get(leftch)==0) map.remove(leftch);
                left ++;
            }

            // number of substrings ending at right
            count += (i - left + 1);

        }

        return count;
    }


    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        int result = countSubStr(s, k);
        System.out.println(result);

    }
}
