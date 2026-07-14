import java.util.HashMap;

public class SubArr {

    public static int subarraysDivByK(int arr[], int k){
        int count =0;
        int sum = 0;
        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            sum += arr[i]; // 3
            if(sum%k==0){
                map.put(i, ++count);
            }
        }
        return map.get(arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k =3;
        int res = subarraysDivByK(arr, k);
        System.out.println(res);
    }
}
