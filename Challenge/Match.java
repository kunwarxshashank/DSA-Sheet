import java.util.Arrays;
import java.util.Scanner;;
public class Match{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int teamA[] = new int[n]; // [1,4,2,4]
        for(int i=0; i<n; i++){
            teamA[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int teamB[] = new int[m]; // [3,5];
        for(int j=0; j<m; j++){
            teamB[j] = sc.nextInt();
        }

        int ans[] = new int[m];

        Arrays.sort(teamA); // [1,2,4,4]

        for (int i = 0; i < m; i++) {

            int low = 0;
            int high = n - 1;
            int count = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (teamA[mid] <= teamB[i]) {
                    count = mid + 1; // everything from 0 to mid is <= teamB[i]
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            ans[i] = count;
        }
        for (int i : ans) {
            System.out.println("Arr: "+i);
        }
        
    }
}