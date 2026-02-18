// public class StringPalindrome {


//     public static Boolean Check(int i, int j, String str){
//         if(i>=j) return true; //Base condition to stop it.

//         // If any of char mismatch return false
//         if(str.charAt(i)!=str.charAt(j)){
//             return false;
//         }

//         // Return Increment
//         return Check(i+1, j-1, str);
//     }


//     public static void main(String[] args) {
//         String str = "A man, a plan, a canal: Panama";
//         str = str.replaceAll("[^A-Za-z]", "").toUpperCase();
        
//         int len = str.length()-1;
//         Boolean result = Check(0, len, str);
//         System.out.println("Result: "+result);
       
//     }
// }


public class StringPalindrome {

    public static boolean isPalindrome(String s, int i, int j){
        // Base case: if crossed the middle, it's a palindrome
        if (i >= j) {
            return true;
        }
        // If any of char mismatch return false
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPalindrome(s, i+1, j-1);
    }


    public static boolean isPalindrome(String s) {
        // Clean and normalize string
        s = s.replaceAll("[^A-Za-z]", "").toUpperCase();
        return isPalindrome(s, 0, s.length() - 1);
    }

    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Boolean result = isPalindrome(s);
        System.out.println("Result: "+result);
       
    }
}
