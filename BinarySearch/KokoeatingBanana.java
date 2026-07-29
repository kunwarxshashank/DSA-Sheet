import java.util.Arrays;

public class KokoeatingBanana{

    public static int findhrs(int[] arr, int h, int k){
        // yaha sare array check kro aur find kro kitni hours lg rha 
        // hai K ki speed me khane me
        // k = 6 arr = {3,6,7,11}
        int count = 0;
        
        // we can use ceil formula (i+k-1)/k;
        for (int i : arr) {
            count += (i+k-1);
        }
        return count;

        /* // INSTEAD OF THIS //

        for (int i : arr) {
            if(i<k){
                count += 1;
            }else if(i%k != 0){
                count += i/k+1;
            }else if(i%k==0){
                count += i/k;
            }
        }
        
        */

    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 7, 11};
        int h = 8;

        int low = 1; // 1 minium speed khane ki
        int high = Arrays.stream(arr).max().getAsInt();


        while (low<high) {
            int mid = low+(high-low)/2; // 6
            int hrs = findhrs(arr, h, mid);

            if(hrs>h){
                low = mid+1;
            }else{
                high = mid; // yahan high = mid; isliye nahi hai kyunki possibility hai ki mid v
                high = mid-1;            // answer ho skta hai
            }
        }
        System.out.println(low);
    }
}