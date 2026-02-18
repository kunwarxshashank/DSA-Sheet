/*
public class SlidingWindow{

    public static void SlideWindow(int arr[], int k){       
        int n = arr.length; //6
        int max = 0;
        // k = 3;


        for(int i=0; i<=n-k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum = sum+arr[j];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println(max);

    }

    // First loop me i-0 se i-4 tak chlega kyuki age 3 value nhi milegi ki usko calculate kre
    // uske andar ka loop i se leke k tak chlenge, aur k=3 start me rhega then usko +1 krte rhenge 
    // fir uska jo bhi aega loop me sum store krlenge
    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 100, 5, 5};
        int k = 3;
        SlideWindow(arr, k);
    }
}

*/

// O(n) sliding window

public class SlidingWindow{

    public static int SlideWindow(int arr[], int k){
        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];          // add next element

            if (i >= k - 1) {             // window size reached
                System.out.println(" i is "+i);
                maxSum = Math.max(maxSum, windowSum);
                System.out.println(arr[i]);
                windowSum -= arr[i - (k - 1)]; // remove left element
            }
        }
        return maxSum;
    }

    // 1> Iterate the whole array
    // 2> Create variable maxsum
    // 3> Count first 3, store each 3 in variable sum now compare maxsum with sum, if(sum>maxsum) maxsum = sum;
    // 4> now move i=2 and count 3 and do it again

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 60, 50};
        int k = 3;
        int result = SlideWindow(arr, k);
        // System.out.println(result);
        
    }
}
