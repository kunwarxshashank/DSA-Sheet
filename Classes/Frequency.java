// wap to sort charachter in a string by their frequncy
// decending wwithout using hashmap or collectio
// ex- input "banana"
// output: "aaannb"

public class Frequency {
    public static void main(String[] args) {
        String str = "banana";
        int n = str.length();
        int newcount = 0;

        for (int i = 0; i < n; i++) {

            // printin all strings
            char ch = str.charAt(i);
            // System.out.println(ch);

            int count = 1;

            for (int j = 0; j < i; j++) {
                char chx = str.charAt(j);
                // System.out.println("comapring: "+ch+" & "+chx);
                if (ch == chx) {
                    count++;
                }

            }
            System.out.println(ch+""+count); // "b1a1n1a2n2a3"

            // sort by descending
            // System.out.println((int)('a'));

            int max = count; // 1 // 1// 1// 2 // 2// 3//

            if(max>max){
                System.out.println(ch+""+max);
            }

            
           

        }
    }
}
