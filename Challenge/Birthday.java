import java.util.*;
public class Birthday {

    public int findRes(List<List<Integer>> res, int max, int len){
        List<Integer> list = new ArrayList<>();
        // create array to store
        int[] arr = new int[max];
        for(int i=0; i<=max; i++){
            arr[0] = i+1;
        }

        // arr [1,2]

        for(int i=0; i<arr.length; i++){
            if(i==0){
                list.add(arr[0]);
            }

            // agr size hogya to result me list ko daal denge
            if(list.size()>=len){
                res.add(list);
            }

            // agar i+1 divisible by i se hai to list me add kro
            if(arr[i]%arr[i-1]==0){
                list.add(arr[i]);
            }
        }

        return res.size();
    }

    public void main(String [] args){
        Scanner s = new Scanner(System.in);
        int max = s.nextInt();
        int len = s.nextInt();

        List<List<Integer>> res = new ArrayList<>();
        int x = findRes(res, max, len);
        System.out.println(x);

    }
}
