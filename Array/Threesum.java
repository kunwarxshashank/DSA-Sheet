import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // pahle to array sort kar lo
        // then 1 loop intiate kro
        // uske andar two sum lagao and make sure they aren;;t duplicate
        // then each set of array ko list me store kro
        // 1. sort the array
        Arrays.sort(nums); // {-4,-1,-1,0,2,1}

        // 2. start the loop
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            // skip duplicate i
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];
                // 3. use two sum
                if (sum == 0) {

                    // Adding list in side a list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;
                    
                    // skip left duplicate if already exist
                    while(left<right && nums[left-1]==nums[left]){
                        left++;
                    }

                    // skip right dupilciate if already exist
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }

                } else if (sum < 0) { // -1 < 2
                    left++;
                } else {
                    right--;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,1,1,2};
        System.out.println(threeSum(arr));
    }
}
