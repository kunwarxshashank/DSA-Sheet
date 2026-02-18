// public class Unionof2SortedArr {

//     public static void arrayUnion(int[] arr1, int[] arr2) {
//         int start = 0;

//         // step1: remove duplicate value from arr1 and arr2 => {1,2,3,5,6,7,8,9,10}  {2,3,4,5,11,12}
//         // step2: combine both array in newarr[] = {1,2,3,5,6,7,8,9,10,2,3,4,5,11,12} 
//         // step3: again remove duplicate value from newarr
        
//         // step1: removing duplicate arr
//         removeDuplicate(arr1);
//         // removeDuplicate(arr2);

//         // step2: comibing both array in newarr
//         int newarr[] = new int[arr1.length+arr2.length];

//         // store arr1 in newarr
//         for(int i=0; i<arr1.length; i++){
//             newarr[start++] = arr1[i];
//         }

//         // store arr2 in newarr
//         for (int i = 0; i < arr2.length; i++) {
//             newarr[start++] = arr2[i];
//         }


//         // step3: sort the newarr

//         // step4: remove duplicate from newarr
//         // removeDuplicate(newarr);

//         // print newarr
//         // for (int i = 0; i < newarr.length; i++) {
//         //     System.out.println(newarr[i]);
//         // }

//     }

//     public static void removeDuplicate(int[] arr) {
//         int start = 0;
//         for(int num: arr){
//             if(arr[start] == arr[start++]){
//                 arr[start-1] = num;
//             }
//             System.out.println("removing: "+arr[8]);
//         }
        
//     }

//     public static void main(String[] args) {

//         int arr1[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 10};
//         int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
//         arrayUnion(arr1, arr2);



//         // output = {1,2,3,4,5,6,7,8,9,10,11,12}


//     }
// }


import java.util.ArrayList;
public class Unionof2SortedArr {

    public static ArrayList<Integer> arrayUnion(int[] arr1, int[] arr2) {

        int n = arr1.length; // 10
        int m = arr2.length; // 7

        // int arr1[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 10};
        // int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        // storing union in a list
        ArrayList<Integer> arr = new ArrayList<Integer>();

        // iteratig until both element have commo
        int i=0, j=0;

        while (i<n && j<m) {

            if(arr1[i]<arr2[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) != arr1[i]){
                    arr.add(arr1[i]);
                }
                i++;
            }

           else if(arr1[i]>arr2[j]){
                if(arr.isEmpty() || arr.get(arr.size()-1) != arr2[j]){
                    arr.add(arr2[j]);
                }
                j++;
            }

            // Elements are equal, add once if not duplicate
            else{
                if(arr.isEmpty() || arr.get(arr.size()-1) != arr1[i]){
                    arr.add(arr1[i]);
                }
                i++;
                j++; 
            }
        }


        // Append remaining elements from arr1
        while(i<n){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=arr1[i]){
                arr.add(arr1[i]);
            }
            i++;
        }

        // Append remaining elements from arr 2
        while(j<m){
            if(arr.isEmpty() || arr.get(arr.size()-1)!=arr2[j]){
                arr.add(arr2[j]);
            }      
            j++;
        }

        return arr;
    }





    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10, 10};
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        
        Unionof2SortedArr union = new Unionof2SortedArr();
        ArrayList<Integer> result = union.arrayUnion(arr1, arr2);
        System.out.println(result);
    }
}
