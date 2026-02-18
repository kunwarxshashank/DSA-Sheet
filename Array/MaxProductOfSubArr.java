public class MaxProductOfSubArr{

    public static int maxProduct(int arr[]) {

        int window = 1;
        int maxproduct = 0;

        // first window
        for (int i = 0; i < arr.length; i++) {
            window *= arr[i]; // -48
        }
        
        

        maxproduct = window;

        // excule first i and include i-k+1
        for (int i = 1; i < arr.length; i++) {
            window = (window/arr[i])*arr[i+1];
            maxproduct = Math.max(maxproduct, window);
        }

        
        
        return maxproduct;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}