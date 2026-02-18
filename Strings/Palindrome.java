public class Palindrome {
    public static boolean checkPalindrome(String str) {

        // converting string to array of characters
        char[] c = str.toCharArray();

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(c[left]!=c[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "lol";
        boolean result = checkPalindrome(str);
        System.out.println(result);
    }
}
