import java.util.ArrayList;

public class Leaders {
    public static ArrayList<Integer> findLeaders(int arr[]) {

        ArrayList<Integer> newarr = new ArrayList<>();
        int n = arr.length - 1; // arr[n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i] && arr[j] > arr[n]) {
                    newarr.add(arr[j]);
                }

            }
            if (i == n) {
                newarr.add(arr[n]);
            }
        }

        return newarr;
    }  

    public static void main(String[] args) {
        int arr[] = { 4,7,1,0}; // 7, 1, 0 => 10, 22, 12, 3, 0, 6 => 22, 12, 3, 6
        ArrayList<Integer> result = findLeaders(arr);
        System.out.println(result);
    }
}
