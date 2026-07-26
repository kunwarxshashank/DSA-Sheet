import java.util.ArrayList;

public class MergeTwoSortedArr {
    public static void main(String[] args) {
    int nums1[] = {1,2,3,0,0};
    int nums2[] = {2,5,6};
    int n = 3;
    int m = 3;
    int i = 0;
    int j = 0;

    ArrayList<Integer> list = new ArrayList<>();
        
        while (i<n && j<m) {  
            

            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }else{
                list.add(nums2[j]);
                j++;
            }
        }

        // merge remaining element of nums1
        while (i<n) {
            list.add(nums1[i]);
            i++;
        }
        // merge remaining element of nums2
        while (j<m) {
            list.add(nums2[j]);
            j++;
        }


        System.out.println(list);
    }
}
