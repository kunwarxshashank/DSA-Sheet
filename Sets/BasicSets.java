package Sets;

import java.util.*;

/*

TIMECOMPLEXITY: It measures the number of basic operations an algorithm performs as a function of input size n

######## Yani kitne operation hue algorithm me if we increase input size n ###########

Instead of asking:
❌ “How many seconds will this program take?”

We ask:
✔ “How does work increase when input becomes large?”


#Set represent a collection of framework
#It consists of unique element
#Set is implemented using hashmap => to isme key value pair hogi, but yaha values me dummy values store hogi
#It can be unordered


HashSet - > Normal set can be ordered unordered
LinkedHashSet -> Jis order me insert krenge usi me print hoga
TreeSet -> Sort kar dega

*/

public class BasicSets {
    public static void main(String[] args) {

        /*
         * HashSet<Integer> st = new HashSet<>();
         * st.add(18);
         * st.add(10);
         * st.add(11);
         * st.add(12);
         * st.add(13);
         * System.out.println(st);
         */

        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(18);
        st.add(10);
        st.add(11);
        st.add(12);
        st.add(13);
        // System.out.println(st); // Output: 18, 10, 11, 12, 13

        // Printing set
        for(Integer i: st){
            System.out.println(i);
        }

        TreeSet<Integer> st1 = new TreeSet<>();
        st1.add(10);
        st1.add(1);
        st1.add(12);
        // System.out.println(st1); // 1, 10, 12

        TreeSet<String> st2 = new TreeSet<>();
        st2.add("a");
        st2.add("x");
        st2.add("b");
        st2.add("c");
        // System.out.println(st2); // a, b, c, x

        



        // ################## Iteration ###################
        
        // HashSet doesn;t support set.get(0);
        // so we use Iterator<E> iterator()



        Iterator<Integer> it = st.iterator();
        

        // it is a safe way to remove using iterator
        while (it.hasNext()) {
            Integer x = it.next();
            if(x==10){
                it.remove(); // remove 20 from x 
            }   
        }

        System.out.println(st);





        // unsafe way to remove ConcurrentModificationException exception
        for (Integer x : st) {
            if (x == 10)
                st.remove(x);   // ❌ CRASH
        }


        // ############-------why we can't use st.remove-------------################

        /*

        Because Internally ye loop Iterator use krta hai and

        ✔ Iterator expects collection structure to stay unchanged
        ✔ set.remove() modifies structure
        ✔ Iterator detects mismatch → Exception

        So It gives ConcurrentModificationException
                
        */


    };

}
