/*


*/
public class RangeSumQuery {

    private int[] nums;

    // Note: Constructor doesn't have return value, they intialize object instance
    // variable when object is created
    public RangeSumQuery(int[] nums) {
        this.nums = nums;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        if (left == 0)
            return prefix[right];

        return prefix[right]-prefix[left-1];
    }

}
