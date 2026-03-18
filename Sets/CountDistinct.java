package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class CountDistinct {
    public static void main(String[] args) {
        int arr1[] = { 7, 8, 7, 58, 100, 120 }; // 7,8,58,100,120
        int arr2[] = { 58, 100, 65, 7, 9, -1 }; // 65 , 9, -1

        // output: {8,120, 65, 9, -1} aagr character same hai to sirf ek hi count kro
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // adding value in set
        for (Integer integer : arr1) {
            set1.add(integer);
        }
        // System.out.println(set1);

        Iterator<Integer> it = set1.iterator();

        for (Integer integer : arr2) {
            if (!set1.contains(integer)) {
                set1.add(integer);
            } else {
                while (it.hasNext()) {
                    Integer x = it.next();
                    it.remove();
                }
            }
        }

        System.out.println(set1.size()); // 8
    }
}
