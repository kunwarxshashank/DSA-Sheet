import java.util.ArrayList;
import java.util.Scanner;

public class OddLengthString {
    /* 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String arr[] = new String[n];

        // input string
        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }

        // create arraylist to store odd strings
        ArrayList<String> list = new ArrayList<>();

        // traverse list
        // 1. Sort the list by character count
        // 2. Store list whose length is odd
        for (String str : arr) {
            if(str.length()%2==1){
                list.add(str);
            }
        }

        // list = [morning, welcome]
        if(list.size()==0){
            System.out.println("Better luck next time");
        }

        // return first string with maximum length
        // traverse list and return the max length;
        String ans = "";

        
        int curlen  = 0;
        int maxlen = 0;

        for (String str : list) {
            int len = str.length(); // 7
            curlen = Math.max(curlen, len); // 7
            if(curlen>maxlen){
                ans = str;
            }
            maxlen = Math.max(maxlen, curlen); // 7
        }

        System.out.println(ans);
        

        int maxlen = 0;
        for(String str: list){
            int len = str.length();
            if(len>maxlen){
                ans = str;
                maxlen = len;
            }
        }

        System.out.println(maxlen);
        

    }

    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // input string
        int maxlen = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            String str = scan.next();
            if(str.length()%2==1 && str.length()>maxlen){
                ans = str;
                maxlen = str.length();
            }
        }

        System.out.println(ans);
    }
}
