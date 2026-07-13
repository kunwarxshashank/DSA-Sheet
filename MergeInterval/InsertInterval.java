import java.util.*;

public class InsertInterval {

    public static int[][] MergeIt(int arr[][], int insert[]) {
        // edge case
        if (arr.length <= 1) {
            return arr;
        }


        // sort the arr
        Arrays.sort(arr, (a,b)-> Integer.compare(a[0], b[0]));

        int ns = insert[0]; // 4
        int ne = insert[1]; // 8

        List<int[]> list = new ArrayList<>();
        boolean inserted = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]>=ns && !inserted){
                list.add(new int[]{ns,ne});
                inserted = true;
            }
            list.add(new int[]{arr[i][0],arr[i][1]});
        }
        
        // if the insert interval not added add to end
        if (!inserted) {
            list.add(new int[]{ns, ne});
        }

        // {1,3} {2,5} {6,9}
        // Now merge part
        List<int[]> mergedList = new ArrayList<>();
        int[] start = list.get(0); // {1,3}
        for(int i=1; i<list.size(); i++ ){
            int[]end = list.get(i); // {2,5} {6,9}

            // No overlap, add the active interval to results and update active
            if(start[1]<end[0]){
                mergedList.add(start);
                start = end;
            }else{
                start[1] = Math.max(start[1],end[1]);
            }
    
        }
        // add the last interval
        mergedList.add(start);
        return mergedList.toArray(new int[0][]);

    }
    public static void main(String[] args) {
        int arr[][] = {
                { 1,3} ,{6,9} // { 1, 2 },{ 3, 5 },{4,8} {6,7} , {8,10},{12,16}
        };

        int insert[] = {2,5};

        int result[][] = MergeIt(arr,insert);
                // Print the result to verify
        System.out.println(Arrays.deepToString(result));

    }
}