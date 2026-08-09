import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointOrigin {
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 1;
        

        // yaha priorityqueue me hum dono distance me comparision krenge kaunsa sa distance bada hai
        // jo bada hoga use heap me daal denge

        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)-> {
            int disA = a[0]*a[0]+a[1]*a[1]; // disA = 9+
            int disB = b[0]*b[0]+b[1]*b[1];

            return Integer.compare(disB, disA); // maxheap  []
        });

        // ab heap me add kro badi value;
        for (int[] p : points) {

            pq.add(p);

            if (pq.size() > k) {
                pq.poll();
            }
        }


    }
}
