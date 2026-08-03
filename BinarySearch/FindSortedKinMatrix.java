import java.util.ArrayList;
import java.util.*;

public class FindSortedKinMatrix {
    // public static void main(String[] args) {
    //     int arr[][] = {{1,5,9}, {10,11,13}, {12,13,15}};
    //     int len = (arr.length)*(arr[0].length);
    //     int k = 8;
    //     int newarr[] = new int[]{len};
    //     ArrayList<Integer> list = new ArrayList<>();

    //     int n = arr.length-1; // 2
    //     int m = arr[0].length-1; // 2
    //     int row = 0;
    //     int col = 0;

    //     list.add(arr[row][col]); // [1]
        
    //     while (row<n && col <m) {
    //         if(arr[row+1][col]>arr[row][col+1]){
    //             list.add(arr[row][col+1]); // [1, 5]
    //             col++;
    //             if(col==m && row<n){
    //                 col = 0;
    //             }
    //         }else if(arr[row+1][col]<arr[row][col+1]){
    //             list.add(arr[row+1][col]);
    //             row++;
    //         }else{
    //             list.add(arr[row+1][col]);
    //             row++;

    //         }
    //     }
    //     System.out.println(list);
    // }

    public static void main(String[] args) {
        int arr[][] = {{1,5,9}, {10,11,13}, {12,13,15}};
        int len = (arr.length)*(arr[0].length);
        int k = 8;
        int newarr[] = new int[]{len};
        ArrayList<Integer> list = new ArrayList<>();

        int n = arr.length-1; // 2
        int m = arr[0].length-1; // 2

        
        int col = 0;
        int row = n;

        int low = 0;
        int high = arr[row][col]; // 0
        int mid = low+(high-low)/2; // 8

        while (row>=0 && col<=m) {
            if(arr[row])
        }
    }
}
