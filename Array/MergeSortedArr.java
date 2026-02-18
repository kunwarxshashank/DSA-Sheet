
import java.util.ArrayList;

public class MergeSortedArr {
   
    /*
        TIME COMPLEXITY: O(N)
    */

    public static void main(String[] args) {
        int nums1[] = { 1, 5, 7, 9, 10 };
        int nums2[] = { 2, 4, 6, 8 }; // output = {1,2,4,5,6,7,8,9}

        // using two pointer
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        // ye case valid tab tak rhega jab tk ye dono same length ke hai

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) { // 1<2; 5<6
                list.add(nums1[i]); // 1 2 4 5
                System.out.println(" i is : " + i);
                i++; // 1 // 2 // 3
                continue;
            }
            list.add(nums2[j]); // 1 2 4 5 6
            j++; // 1 // 2

        }

        // agar num1 ka length num2 se jada hai

        while(i<nums1.length){
            list.add(nums1[i]);
            i++;
        }

        // agar num2 ka length num1 se jada ho
        while (j<nums2.length) {
            list.add(nums2[j]);
            j++;
        }




        for (int ix : list) {
            System.out.println(ix);
        }

    }
}


