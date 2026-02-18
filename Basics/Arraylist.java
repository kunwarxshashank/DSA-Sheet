import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // Initial size of arraylist = 10, when created
        // we can use List in Place of ArrayList;

        // adding element
        arr.add(100);
        arr.add(500);

        // adding element in position arr.add(index, element)
        arr.add(2, 300);
        arr.add(3, 400);

        // printing arraylist arr.get(index)
        int element = arr.get(0);
        // System.out.println(element);

        // set/change element in index
        arr.set(0,50);

        // delete element
        arr.remove(2);

        // get size of list
        arr.size();

        // contains
        arr.contains(100); // print boolean

        // loop in arraylist
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // sorting
        Collections.sort(arr);
        System.out.println(arr);

    }
}
