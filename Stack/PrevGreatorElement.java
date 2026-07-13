import java.util.*;

public class PrevGreatorElement {
    public static void main(String[] args) {
        int arr[] = { 10, 4, 2, 20, 40, 12, 30 }; // op => {-1,4,4,-1,5}
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1); // => [-1, 10, 4, -1, -1, 40]
        stack.push(arr[0]); // [40, 12]

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                list.add(-1);
            } else {
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }

        System.out.println(list);
    }
}
