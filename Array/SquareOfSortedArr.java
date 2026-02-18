import java.util.ArrayList;
import java.util.Collections;

public class SquareOfSortedArr {

    public static int[] sqofSortedArr(int arr[]) {

        // divide array in two parts arr1 -ve and arr2 +ve
        // reverse the negative => it it become positive
        // now add those two array using two pointer

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();



        // store negative array in list 1 and positve array in list 2
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                list1.add(arr[i]*arr[i]);
            }else{
                list2.add(arr[i]*arr[i]);
            }
        }

        
        // reverse into positive
        Collections.reverse(list1);

        // merging two sorted array
        // list1= {1, 16, 25}   // 3
        // list2= {0 , 3, 100}  // 3

        int left = 0;
        int right = 0;

        while (left<list1.size() && right < list2.size() ) {
            if(list1.get(left)<list2.get(right)){
                list3.add(list1.get(left++));
            }else{
                list3.add(list2.get(right++));
            }
        }

        // if list1 size is greator than list 2
        while(left<list1.size()){
            list3.add(list1.get(left++));
        }

        // if list2 size greator than list 1
        while(right<list2.size()){
            list3.add(list2.get(right++));
        }

        int newarr[] = new int[list3.size()];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = list3.get(i);
        }
        return newarr;
    }

    public static void main(String[] args) {

        int arr[] = { -5, -4, -1, 0, 3, 10 }; // Output: {0, 1, 9 , 16 , 100}

        // 16, 1, 0, 9, 100
        int result[] = sqofSortedArr(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
