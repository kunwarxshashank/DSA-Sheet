public class Pivot {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        int n = arr.length; // 6

        int left = 0;
        int sum = 0;

        for(int x: arr){
            sum+=x; // 30
        }

        for(int i=0; i<n; i++){
            int right = sum-left-arr[i];
            if(left==right){
                System.out.println(i);
            }
        }
        
    }
}