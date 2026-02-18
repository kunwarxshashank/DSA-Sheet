public class Linear{
    public static void main(String[] args) {
        int arr[] = {1,2,6,7,9};
        int search = 6;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==search){
                System.out.println(i);
            }
        }
    }
}