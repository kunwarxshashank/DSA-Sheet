public class TwoDArraySearch{
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        int low = 0;
        int high = arr.length;

        while (low<high) {
            int row = low+(high-low)/2;
            if(target<arr[row][0]){
                
            }
        }
    }
}