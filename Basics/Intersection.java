import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 3, 4, 5, 6 };

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            list.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(!list.contains(arr2[i])){
                list.add(arr2[i]);
            }         
        }



        

        for (int x : list) {
            System.out.println(x);
        }

    }

}
