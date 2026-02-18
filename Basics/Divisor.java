import java.util.Arrays;
public class Divisor {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        
        // Step 1: Count how many divisors 'n' has
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count++;
            }
        }

        // Step 2: Create array of exact size
        int arr[] =  new int[count];

        //Creting index to store i (divisor)
        int index =0;

        //fill aray
        for(int i=1; i<=n; i++){
            if(n%i==0){
                arr[index++] = i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
