public class FindUnique {
    public static int[] removeDuplicate(int[] arr) {
        int left = 0;
        int right = 1;

        while(left<right){
            if(arr[left]!=arr[right])
                left++;
                arr[left] = arr[right];
        }

        for (int i : arr) {
            System.out.println(arr[i]);
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4};
        System.out.println(removeDuplicate(arr));
    }
}
