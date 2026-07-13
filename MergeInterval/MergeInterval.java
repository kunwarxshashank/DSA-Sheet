import java.util.*;

public class MergeInterval {

    public static int[][] MergeIt(int arr[][]) {
        // sort the arr
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start1 = arr[0][0];
        int end1 = arr[0][1];
        if (arr.length <= 1) {
            return arr;
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int start2 = arr[i][0];
            int end2 = arr[i][1];
            if (end1 < start2) {
                list.add(new int[]{start1,end1});
                start1 = start2;
                end1 = end2;
            } else {
                end1 = Math.max(end1, end2);
            }
        }
        // last wali list
        list.add(new int[]{start1, end1});
        return list.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 5, 18 }
        };

        int result[][] = MergeIt(arr);
        System.out.println(Arrays.deepToString(result));
    }
}