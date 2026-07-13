import java.util.*;

public class Intersection {
    public static int[][] mergeInterval(int[][] arr1, int[][] arr2) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            int start0 = arr1[i][0];
            int end0 = arr1[i][1];

            int start1 = arr2[j][0];
            int end1 = arr2[j][1];

            int start = Math.max(start0, start1);
            int end = Math.min(end0, end1);

            if (start <= end) {
                list.add(new int[] { start, end });
            }

            if (end0 < end1) {
                i++;
            } else {
                j++;
            }
        }

        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                { 0, 2 }, { 1, 3 }
        };

        int[][] arr2 = {
                { 5, 10 }, { 6, 9 }
        };

        int result[][] = mergeInterval(arr1, arr2);
        System.out.println(Arrays.deepToString(result));
    }
}
