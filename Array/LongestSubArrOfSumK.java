
public class LongestSubArrOfSumK {
/*
    public static int SubArr(int arr[], int k) {
        int n = arr.length;
        int maxlength = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum==k){
                   maxlength = Math.max(maxlength, j-i+1);
                }

            }

        }
        return maxlength;
    }
*/

    public static int SubArr(int arr[], int k) {
        int n = arr.length; // 7
        int maxlength = 0; 
        int count = 0;
        int sum = 0;

        while (count < n) {
            
            sum += arr[count];
            count +=1;

            if(sum==k){
                maxlength = Math.max(maxlength, count);
                sum = 0;
                count = 0;
            }
            
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int arr[] = { 10,3, 5, 2, 7, 1, 9 };
        int k = 10;
        int result = SubArr(arr, k);
        System.out.println(result);

    }
}
