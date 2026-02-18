import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("h");
        list.add("e");
        list.add("l");
        list.add("l");
        list.add("o");

        

        // yaha pe error aa rha hai kyunki linkedlist me index 4 tak hi bana hai 5, 6, 7, 8, 9 empty hai
        // null hai to address reference nhi hoga
        list.add(9, "d");


        System.out.println(list);
    }

}


// insertion in linked list faster kyunki hume array ki trh shift nhi karana pdta
// bs ek address linked ho jata hai 