/* 
Solution1: set unique true  

    public static int appearOnce(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            boolean unique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i!=j && nums[i] == nums[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique == true) {
                return nums[i];
            }
        }
        return -1;
    }

Solution2: By increasing count and matching by count

    public static int appearOnce(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count ++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }

*/
public class NumberAppearOnce {
    public static int appearOnce(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            System.out.print("xor of "+xor+ " & "+num+" :");
            xor ^= num;
            System.out.println(xor);
        }
        return xor;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 3,2};
        int result = appearOnce(nums);
        System.out.println(result);
    }
}


// outer loop me by default hum true set karte hai, tanki agar inner loop me wrong validation na ho
// to by default wo true ho, to inner loop exit karane ke baad condition de denge if(result=true)return i;

