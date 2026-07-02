public class Sqrt {
    public static int findSqrt(int x) {
        int low = 1;
        int high = x;
        int ans = 0;
        
        if (x < 2)
            return x;

        while (low <= high) {

            int mid = low+(high-low)/2; // 4 // 6

            // ye check kr rha kya x directly divisble hai mid ke agar ha to mid hoga
            // e.g mid = 3, x = 9 ==> 3 == 9/3

            if(mid == x/mid){
                return mid;
            }else if(mid > x/mid){ // 4>2
                ans = mid; // mid = 4
                low = mid+1; // low =5
            }else{
                high = mid-1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt(8));
    }
}