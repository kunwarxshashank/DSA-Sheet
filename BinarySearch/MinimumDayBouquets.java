import java.util.Arrays;

public class MinimumDayBouquets{

    public static int countBouquets(int [] arr, int m, int k, int day){
        int flowers = 0; // {7,7,7,7,12,7,7}; {1,10,3,10,2}
        int bouquet = 0;
        for (int bloom : arr) {
            // agar khile fool, day is less equal hai yani ek fool khila hai
            if (bloom <= day) {
                flowers++;

                // agar k flower ek saath khile hai yani ek boquet ban gya
                // boquet banane ke baad flower ko zero kr denge tanki fir se new boquet bana ske
                if (flowers == k) {
                    bouquet++;
                    flowers = 0; // flowers used
                }
            } 
            
            // agar koi badi date agyi to adjacency tod dena hai flower ko zero kr ke
            else {
                flowers = 0; // adjacency broken
            }
        }
        return bouquet;
    }


    public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2};
        int m = 3;
        int k= 1;

        int low = 1;
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;

        while(low<=high){
            int day = low+(high-low)/2; // 5
            int bouquet = countBouquets(bloomDay, m, k, day);
            if (bouquet >= m) {
                // We can make enough bouquets.
                // Maybe there's an even smaller answer.
                ans = day;
                high = day-1;
            } else {
                // Not enough bouquets.
                low = day + 1;
            }
        }
        System.out.println(low);
    }
}

/*

int ans = -1;

while (low <= high) {
    int mid = low + (high - low) / 2;

    if (possible(mid)) {
        ans = mid;
        high = mid - 1;
    } else {
        low = mid + 1;
    }
}

return ans;

--------------

while(low<=high)
    ans = mid;
    return ans;

    TAB use krete hai jab, har valid answer store krte hai

while(low<high)
    return low;

    Tab use krte hai jab, low hi answer ho.


*/