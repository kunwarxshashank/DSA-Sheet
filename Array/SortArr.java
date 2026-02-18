public class SortArr {
    public static int sortArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;   
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,2,1,0,0,1,2};
        int result = sortArray(arr);
        System.out.println(result);
    }
}
