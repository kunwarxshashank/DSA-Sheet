import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestinArr {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int k = 4;

        /*
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            maxheap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] < maxheap.peek()) {
                // remove the top max
                maxheap.poll();
                // add then arr[i];
                maxheap.add(arr[i]);
            }
        }

        System.out.println(maxheap.peek());       
        */

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minheap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if(arr[i]<minheap.peek()){
                // minheap ka last element pop kro
                minheap.add(arr[i]);
            }
        }

        System.out.println(minheap);
 
    }
}