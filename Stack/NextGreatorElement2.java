import java.util.Arrays;
import java.util.Stack;

public class NextGreatorElement2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3};     // {2, 3, 4, -1,4}
        int n = arr.length;
        int newarr[] = new int[n];
        Arrays.fill(newarr, -1);   // assume nobody finds a taller kid at first
        Stack <Integer> stack = new Stack<>();

        for(int i=0; i<2*n; i++){
            int currentValue = arr[i % n];  // % wraps us back to start
            while (!stack.isEmpty() && arr[stack.peek()]<currentValue) {
                int indx = stack.pop();
                newarr[indx] = currentValue;
            }


            if(i<n){
                stack.push(i);
            }
        }

        System.out.println(Arrays.toString(newarr));
    }
}
