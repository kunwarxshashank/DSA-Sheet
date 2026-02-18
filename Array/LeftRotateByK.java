public class LeftRotateByK {

    public static int Rotate(int[] arr) {
        int n = arr.length;
        int k = 3;
        int x = 0;
        int newarr[] = new int[n];

        if(n==0){
            System.out.println("arr can't be 0 length");
        }

        for (int i = k; i < arr.length; i++) {
            newarr[x] = arr[i]; // i[2]=> 30; i[3]==>40; i[4]=>50;
            x++;
        }

        for (int i = 0; i < k; i++) {
            newarr[x] = arr[i];
            x++;
            
        }
        

        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
        return x;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50};
        int k = Rotate(arr);

    }
}
