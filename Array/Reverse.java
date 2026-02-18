public class Reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};  // [3,2,1,6,5,4,8,7]
        int left = 0; //left = 3 
        int right = 2; //right = 5 





        for (int i=0; i<arr.length; i++) {
            while(left<right){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
            if(left==right){
                left = left+1;
                right = right-1;

                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
            System.out.println(arr[i]);
            
        }

    }
}
