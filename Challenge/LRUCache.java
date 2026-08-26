import java.io.*;
import java.util.*;
public class LRUCache{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken()); // input 3 9
        int n = Integer.parseInt(st.nextToken()); // st.nextToken() for same line

        // for new line input
        
        // int c = Integer.parseInt(br.readLine());
        // int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> cache = new LinkedList<>();

        // In LinkedList
        // int x = 10;
        // cache.add(x) supports only value
        // while cache.remove(x) remove item from index, and cache.remove(Integer.valueOf(x)) remove the object

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            // reading input line from br.readLine();
            String line = br.readLine();
            // converting each line into different parts array seprated by space
            String parts[] = line.split(" ");

            if(parts[0].equals("FETCH")){
                int chunkId = Integer.parseInt(parts[1]);

                // fetch fxn if chunks already in memory
                if(cache.contains(chunkId)){
                    // here we remove value not index e.g 503 index not exist in linkedlist, so we have to remove 503 value
                    cache.remove(Integer.valueOf(chunkId));
                }else{
                    // if cache full
                    if(cache.size()>=c){
                        cache.removeLast();
                    }
                }
                cache.addFirst(chunkId);
            }else{
                // if type status
                if(cache.isEmpty()){
                    sb.append("EMPTY \n");
                } else {
                    for (int x : cache) {
                        sb.append(x).append(" ");
                    }
                    sb.append("\n");
                }
                
            }
        }
        System.out.println(sb);
        
    }
}