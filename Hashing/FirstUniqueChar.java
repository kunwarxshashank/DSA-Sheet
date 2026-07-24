import java.util.*;
public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int alphabet[] = new int[26];

        // 26 size ka aaray lo har character ko a se minus kro uska jo result aye
        // alphabet array me store kro
        // dusre loop me check kro 

        for(char ch: s.toCharArray()){
            int val = ch-'a';
            alphabet[val]++; // character ki index pe value ++ krega 108-97 => 11 
        }

        for(int i=0; i<s.length(); i++){
            // agar character ke index me default 1 hai 2, 3, 4, 5 nahi yani
            // wahi phla character hai..
            if(alphabet[s.charAt(i)-'a']==1){
                    
            }
        }
    }
}
