import java.util.*;

public class TopKWord {
    public static void main(String[] args) {
        String word[] = { "i", "love", "leetcode", "i", "love", "coding" };
        int k = 4;

        HashMap<String, Integer> map = new HashMap<>();
        // Store into map
        for (String string : word) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return a.getValue() - b.getValue(); // Ascending order me sort kro
            }
            return b.getKey().compareTo(a.getKey()); // String ko ascending order me sort kro
        });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            // Initially fill the heap with k elements

            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }
           
        }


        // Extract answer
        List<String> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(pq.poll().getKey());
        }

        // Heap gives reverse order, so reverse it
        Collections.reverse(ans);
        System.out.println(ans);

    }
}
