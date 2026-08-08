import java.util.*;

public class TopKWords {
    public static void main(String[] args) {
        String word[] = { "i", "love", "leetcode", "i", "love", "coding" };
        int k = 4;

        HashMap<String, Integer> map = new HashMap<>();
        // Store into map
        for (String string : word) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        // {i=2, love=2, leetcode=1, coding=1}
        // Min Heap
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {

            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue(); // Smaller frequency first
            }

            return b.getKey().compareTo(a.getKey()); // Reverse lexicographical
        });


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // map ki sari value heap me daaldu, waha wo automatically sorted ho jaenge [leetcode=1, coding=1, i=2, love=2]
            pq.offer(entry);

            // hume sirf K length ki badi values chahiye isliye chhoti values remove kr denge
            if (pq.size() > k) {
                pq.poll();
            }
        }
        
        System.out.println(pq);; // [leetcode=1, coding=1, i=2, love=2]
        
        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll().getKey());
        }
        System.out.println(ans);
        Collections.reverse(ans);

    }
}