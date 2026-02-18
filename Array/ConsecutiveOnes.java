public class ConsecutiveOnes {
    public static int findOnes(int arr[]) {
        
        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
                max = count>max?count:max; //2
            }else{
                count = 0;
            }
        }
        
        return max;

    }
    public static void main(String[] args) {
        int arr[] = {0,1, 1, 0, 1, 1, 1, 0, 1,1,0,0,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
        int result = findOnes(arr);
        System.out.println(result);

    }
}
