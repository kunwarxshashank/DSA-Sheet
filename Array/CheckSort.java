/* 
public class CheckSort {
    public static void main(String[] args) {
        int arr[] = { 10, 10, 30, 40, 50 };
        int n = arr.length;
        boolean sorted = true;

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    sorted = false;
                    break;
                }
            }

        }
        System.out.println(sorted);
    }
}

// Complexity: 0(n^2)

*/

public class CheckSort{
    public static void main(String[] args) {
        int arr[] = { 10, 10, 30, 40, 50 };
        int n = arr.length;
        System.out.println("length is: "+n);
        boolean sorted = true;

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                sorted = false;
            }
        }

        System.out.println(sorted);
    }
}


// Complexity: 0(n)