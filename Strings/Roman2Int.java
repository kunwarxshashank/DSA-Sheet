import java.util.*;

public class Roman2Int {

/*
   public static int convert2Int(String s) {

        Map<Character, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        map1.put("IV", 4);
        map1.put("IX", 9);
        map1.put("XL", 40);
        map1.put("XC", 90);
        map1.put("CD", 400);
        map1.put("CM", 900);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            // agar pair aye to skip kro

            // this ensure ki next character exist, and prevent index outofbound
            // like string.length = 8, so it wil i+1 => 7+1 = 8

            if(i+1<s.length()){ 
                
                String pair = ""+s.charAt(i)+s.charAt(i+1);

                if(map1.containsKey(pair)){
                    result += map1.get(pair);

                    // yaha i++ se ensure kr rhe hai ki next character fir se singly traverse na ho
                    // e.g "CM" added now i move to M then it also add 900+100, to skip it we use i++;
                    // continue => ye use kr rhe hai tanki, loops current iteration skip kr ske aur next age result me value na jae
                    i++;
                    continue;
                }
            }
            // agar normal value aye to use add krdo
            result += map.get(s.charAt(i));
        }
        return result;
    }

*/


/*

   public static int convert2Int(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // add each character into map
        // character add krne ke baad check kro agar peeche, value less hai then result me minus krdo back wali
        // i=0; M=1000 ; result = 1000 | Check if map.get(i-1) < map.get(i)
        // i=1; C=900  ; result = 1100 | Check if map.get(i-1) < map.get(i)
        // i=2; M=1000 ; result = 2100 | Check if map.get(i-1) < map.get(i) => result = result-(2*i) => result = 1900

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            if(i>0 && map.get(s.charAt(i-1)) < map.get(s.charAt(i))){
                result = result-(2*map.get(s.charAt(i-1)));
            }

            result += map.get(s.charAt(i));
        }


        return result;
    }
*/


    public static char values(char ch){
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }
    public static int convert2Int(String s) {
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = values(s.charAt(i));

            if(i>0 && values(s.charAt(i-1))<curr){
                result -= 2*values(s.charAt(i-1));
            }
            result += curr;
        }

        return result;
    }


    public static void main(String[] args) {
        String roman = "MCMXCIV";   // 1000+900+90+4
        int result = convert2Int(roman);
        System.out.println(result);
    }
}
