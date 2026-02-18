// TO Calculate all the possible 
// Combination of String str = "ABC"

public class Backtracking {
    public static void Permutation(String str, String perm, int indx) {
        if (str.length()==0) {
            System.out.println(perm);
            return;
        }
     
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);       
            Permutation(newStr, perm+cur, indx+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        Permutation(str, "", 0);
    }
}
