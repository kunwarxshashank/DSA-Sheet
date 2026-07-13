import java.util.*;

public class DailyTemperature {
    public static void main(String[] args) {

        /* 
        int arr[] = {73, 74, 75, 71, 69, 72, 76, 73};

        Stack<Integer> stack = new Stack<>();
        int[] newarr = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.empty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.empty()) {
                newarr[i] = 0;
            } else {
                newarr[i] = stack.peek() - i;
            }

            stack.push(i);
        }

        System.out.println(Arrays.toString(newarr));

        */

        int arr[] =  {30,40,60,50};
        int newarr[] = new int[arr.length];
         Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            // to basically hum har array ko iterate krenge aur check krenge kya i bada hai stack.peek()
            // stack.peek() khud hi inde store krta hai

            while (!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
               newarr[stack.peek()] = i-stack.pop();
            }

            stack.push(i);
        }

        System.out.println(Arrays.toString(newarr));
    }
}
 