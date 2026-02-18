

public class Palindrome {
    public static void main(String[] args) {
        int n = 100001;
        int x = n;
        int rev = 0;
        while (x>0) {
            int last = x%10; // 1
            rev = (rev*10)+last; // 
            x = x/10; 
        }
         System.out.println(rev);
        if(n == rev){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
       // return false;
    }
}
