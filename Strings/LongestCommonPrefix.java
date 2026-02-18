import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix {

    /*
     * public static String commonPrefix(String[] str) {
     * 
     * for (int i = 0; i < str[0].length(); i++) {
     * for (int j = 1; j < str.length; j++) {
     * if (!str[j].startsWith(str[0].substring(0,i))) {
     * return str[0].substring(0,i-1);
     * }
     * }
     * }
     * 
     * return "";
     * }
     */

    /*
     * public static String commonPrefix(String[] str) {
     * 
     * for (int i = 0; i < str[0].length(); i++) {
     * char ch = str[0].charAt(i); // p
     * 
     * for (int j = 0; j < str.length; j++) { // 3
     * if(ch!=str[j].charAt(i)){ // a
     * return str[j].substring(0, i);
     * }
     * }
     * }
     * return "";
     * }
     */

    public static String commonPrefix(String[] str) {
        StringBuilder newstr = new StringBuilder();

        // sort array of string
        // here array will be sorted by alphabets like aa,ab,ac,ba
        // to isse hoga ki hume sirf first aur last me bus compare krna hoga
        // agar wo dono shi honge mtlv uske andr ke sb shi honge

        
        Arrays.sort(str); //

        String first = str[0];
        String last = str[str.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if(first.charAt(i)!=last.charAt(i)){
                return newstr.toString();
            }

            newstr.append(first.charAt(i));
        }
        return newstr.toString();
    }

    public static void main(String[] args) {
        String[] str = { "apple", "aplication", "adhlid", "appo" }; //
        String result = commonPrefix(str);
        System.out.println(result);

    }
}
