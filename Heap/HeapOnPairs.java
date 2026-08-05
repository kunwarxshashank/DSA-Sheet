import java.util.*;

class Pair {
    int first;
    String second;

    Pair(int first, String second) {
        this.first = first;
        this.second = second;
    }
}

public class HeapOnPairs {
    public static void main(String[] args) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.first != b.first) {
                return a.first - b.first; // 1-2 => -1 If negative return 1st
            }
            return a.second.compareTo(b.second);
        });

        pq.add(new Pair(1, "Aman"));
        pq.add(new Pair(2, "Banjo"));
        pq.add(new Pair(2, "Ankit"));
        // using comparators to sort

        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            System.out.println("{" + pair.first + "," + pair.second + "}");
        }
    }
}
