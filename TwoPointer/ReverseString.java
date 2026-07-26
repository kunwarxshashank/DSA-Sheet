class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        char ch = 'a';


        while (i<j) {
            ch = s[i]; // [h, e
            s[i] = s[j]; // [o, 
            s[j] = ch; // [h, ]
            i++;
            j--;
        }    
    }
}