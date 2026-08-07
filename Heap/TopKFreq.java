import java.util.*;

public class TopKFreq {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 };
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b )->  a.getValue()-b.getValue());

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(pq.size()<k){
                // do elements ko daal do
                pq.add(entry);
                continue;
            }

            // agar bada freq daal rhe hai to k se jada choti frequency wala element ko hata denge
            if(entry.getValue()>pq.peek().getValue()){
                pq.poll();
                pq.add(entry);
            }
        }
        int newarr[] = new int[k];
        int i = 0;
        while (i<k) {
            newarr[i] = pq.poll().getKey();
            i++;
        }
        
        for (int j : newarr) {
            System.out.println(arr[j]);
        }
        

    }
}
