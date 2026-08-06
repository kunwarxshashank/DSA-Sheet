import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class TopKFrequent{
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,3,1,3,2};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Create Heap and store in Map sab sorted order me stored hai 
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b )->  a.getValue()-b.getValue());

        // to hum remove kr skte h top elements ko because unki frequency sbse kam hogi
        // map.entrySet() gives the set of all the key-value pairs of map

        System.out.println(map.entrySet());  // [1=4, 2=4, 3=2]

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            pq.offer(entry); // entry => A single row of hashmap e.g (1,4)
            if(pq.size()>k){
                pq.poll();
            }
        }

        // ab ek new arr bana ke jitne v remaining element hai use store krke return kr denge
        int newarr[] = new int[k];
        for (int i = 0; i < k; i++) {
            newarr[i] = pq.poll().getKey(); // num
        }

        for (int i : newarr) {
            System.out.println(i);
        }
    }
}