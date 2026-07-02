import java.util.Arrays;

public class BinarySearch{
    public static int binary(int arr[], int target) {
        // 4,5,6,7,0,1,2
        // check rotation
        int rotation = 0;
        boolean isrotate = false;


        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]<arr[i] && !isrotate){
                rotation++;
            }else if(arr[i-1]>arr[i]){
                isrotate = true;
                rotation++;
            }
        }

        rotation = isrotate == false ? 0 : rotation;
        System.out.println(rotation);


        int high = arr.length; // 7
        int low = 0; // 0
        Arrays.sort(arr);


        for(int i=0; i<arr.length; i++){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){ 
                return mid+rotation;
            }else if(arr[mid]>target){
                high = high-1;
            }else{
                low = low+1;
            }
        }

        return -1;        
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(binary(arr, target));

    }
}