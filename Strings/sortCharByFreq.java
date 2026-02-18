import java.util.*;

public class sortCharByFreq {

    // public static String isSorted(String s) {
    //     HashMap <Character, Integer> map = new HashMap<>();
        

    //     // count the val
    //     for(char ch: s.toCharArray()){
    //         map.put(ch, map.getOrDefault(ch, 0)+1);
    //     }

    //     // h - 1    e - 1    l -1   l - 2   o - 1


    //     // sort the char by freq
    //     // freqmap looks like {'h' = 1, 'e' = 1, 'l' = 2, 'o' = 1}
    //     // freqMap.keySet() gives: ['h', 'e', 'l', 'o']

    //     ArrayList <Character> chars = new ArrayList<>(map.keySet());

        
    //     // using lambda compartor
    //     chars.sort((a, b) -> map.get(b) - map.get(a)); // this is lambda comparator

    //     /* Comparator Rules

    //         return negative  → a comes before b
    //         return zero      → no change
    //         return positive  → b comes before a 
            
    //         e.g => e(1)-h(1) = 0 => No change
    //             => l(2)-e(1) = 1 => l come before e
                
    //     */

    //     // returns string with repeated 

    //     /*
    //         jitni baar frequency hai utni baar repeat karo
    //         String.valueOf() method in Java is a static method used to convert various data types 
    //         (primitives and objects) into their String representation

    //         .repeat(int count) => repeat the no. of time string should repeat
    //     */


    //     StringBuilder sb = new StringBuilder();
    //     for(char ch: chars){
    //         System.out.println(String.valueOf(ch));
    //         sb.append(String.valueOf(ch).repeat(map.get(ch)));
    //     }

    //     return sb.toString();

    // }


   public static String isSorted(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        

        // count the frequency
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        // {h-1, e - 1, l-2, o-1}

        // creating bucket and use frequency in place of index
        List<Character>[] buckets = new List[s.length()+1];
        // map.keySet() => [h,e,l,o]
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            if(buckets[freq]==null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=buckets.length-1; i>=0; i--){
            if(buckets[i]!=null){
                for(char ch: buckets[i]){
                    sb.append(String.valueOf(ch).repeat(i));
                }
            }
        }

        return sb.toString();

    }


    
    public static void main(String[] args) {
        String str = "hello"; // output lleho
        String result = isSorted(str);
        System.out.println(result);
    }
}
