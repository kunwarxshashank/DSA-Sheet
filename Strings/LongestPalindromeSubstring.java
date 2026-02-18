public class LongestPalindromeSubstring {
    public static boolean checkPalindrome(String str) {
        int left = 0; // 
        int right = str.length()-1; // 2

        while (left<right) {
            if(str.charAt(left)==str.charAt(right)){
                left++; // 1
                right--; // 1
            }else{
                return false;
            }
        }
        return true;
    }

    // find all substring
    public static String findSubstring(String str) {

        String news = "";
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i; j <= str.length(); j++) {
                String sub = str.substring(i, j);

                if(checkPalindrome(sub)){
                    if(sub.length()>news.length()){ 
                        news = sub;
                    }
                }
            }
        }

        return news;
    }

    public static void main(String[] args) {
        String str = "cbbd";
        String s = findSubstring(str);
        System.out.println(s);

        
    }
}
