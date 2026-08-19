import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 5
        int arr[] = new int[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt(); // arr[ 15, 6, 5, 12, 1]
        }

        if(N == 0){
            System.out.println(0);
        }

        int i=0; int j=1;
        int count  = 1;
        for(i=0; i<arr.length-1; i++){
            if(arr[i]*2<arr[j]){
                count ++;
            }
            j++;
        }

        System.out.println(count);
    }
}
