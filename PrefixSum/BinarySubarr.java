import java.util.*;

public class BinarySubarr {
public static void main(String[] args) {
    int arr[] = {1,0,1,0,1};
    int goal = 2;
    int res = 0;
    int prefix = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0,1);

    for(int i=0; i<arr.length; i++){
        prefix+=arr[i]; // [1]

        int need = prefix-goal; // [-1]

        if(map.containsKey(need)){
            res += map.get(need);
        }
        map.put(prefix, map.getOrDefault(prefix, 0)+1);

    }

}
}
