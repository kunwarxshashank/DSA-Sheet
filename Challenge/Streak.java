public class Streak {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 0, 1, 1};
        int n = 8;
        int k = 2;


        int left = 0;
        int right=0;
        int window = 0;
        int max = 0;
        int zerocount = 0;

        for(right =0; right<n; right++){
            // increase zerocount
            if(arr[right]==0){
                zerocount++;
            }


            // jab tak ke bada hai to slide kro
            while (zerocount>k) {
                
                if(arr[left]==0){
                    zerocount--;
                }

                left++;
            }

            // Current valid window length
            window = right - left + 1;

            max = Math.max(max, window);

        }
        System.out.println(max);
    }
}
