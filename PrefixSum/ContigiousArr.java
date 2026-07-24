import java.util.HashMap;

public class ContigiousArr{
    public static void main(String[] args) {
        int arr[] = {0,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int sum = 0;
        int zero = 0;
        int one = 0;
        int res = 0;
        map.put(0,-1);
        for(int i=0; i<n; i++){
            sum += arr[i]; // 

            if(arr[i]==0){
                zero++;
            }else{
                one++;
            }

            int diff = zero-one; // {1, 0, -1, 0, 1, 2}

  
            if(map.containsKey(diff)){
                int id = map.get(diff); // Get Index of Difference 
                int len = i-id;
                res = Math.max(res, len);
            }else{
                map.put(diff, i);
            }

        }
        System.out.println(res);
    }
}