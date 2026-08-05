import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;



public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap.add(10);
        minheap.add(5);
        minheap.add(20);
        minheap.add(2);
        // System.out.println(minheap); // 10, 20 , 40, 50

        while (!minheap.isEmpty()) {
            System.out.println(minheap.poll() + " ");
        }

        // MAXHEAP IMPLEEMENTATION
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33, 53, 10};
        for (int i : arr) {
            maxheap.add(i);
        }

        System.out.println(maxheap);


    }
}
