/*
HashMap : Store with key value pair 0(1);           => Tea, Coffe, Coke || Coke, Coffe, Tea || Coke, Tea, Coffe
Linked HashMap: order wise print krta 0(1);         => Tea, Coffe, Coke
TreeMap: Sorted Manner me print karta hai 0(log n)  => Coffe, Coke, Tea

*/

import java.util.*;
public class HashMaps{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("tea", 10);
        map.put("coffee", 1);
        map.put("coke", 2);


        // Iteration using Set
        Set<String> set = map.keySet();
        for (String string : set) {
            System.out.println(string);
        }


        // Direct Iteration without set object
        for (String string : map.keySet()) {
            System.out.println(string); // Output: // tea // coffee // coke
        }


        if(map.get("coke").intValue()==2){
            System.out.println("TWOOOOO");
        }


    }
}