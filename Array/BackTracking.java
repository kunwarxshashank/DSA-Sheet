// Try → Check → Undo → Try next
import java.util.*;
public class BackTracking {

    static void subsets(int[] arr, int index, List<Integer> current) {
        // Base case: all elements processed
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // adding element in current
        current.add(arr[index]);
        // now adding next element via recursion
        subsets(arr, index + 1, current);

        // here we get {1,2}

        // now we want to backtrack to get all possible combinations
        current.remove(current.size() - 1); // here it make it empty
        subsets(arr, index + 1, current);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        subsets(arr, 0, new ArrayList<>());
    }
}
