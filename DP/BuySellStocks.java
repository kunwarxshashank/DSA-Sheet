class Solution {

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


    public String longestPalindrome(String s) {

        String news = "";
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String sub = s.substring(i, j);

                if(checkPalindrome(sub)){
                    if(sub.length()>news.length()){
                        news = sub;
                    }
                }
            }
        }

        return news;        
    }
}