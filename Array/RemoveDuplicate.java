public class RemoveDuplicate {

    /*------------------BRUTEFORCE------------------
        public static void main(String[] args) {
        int arr[] = {1,2,2,2,3};
        int n = arr.length;

        for(int i=0; i<n; i++){
            boolean duplicate = false;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    duplicate = true;
                }
            }

            if(!duplicate){
                System.out.println(arr[i]);
            }
        }

    }
    
    */


    //---------------OPTIMAL------------------


        public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 3,4 };

        int right = 1; // 2 // 3 // 4
        int left = 0;

        // yaha pe kya ho rha hai ye pura array traverse kar rha hai
        // aur agar arr[left] arr[right] ke equal nhi hai to
        // use left me daal de raha and left++
        // and increment the right the right 

        while(right<arr.length){
            if(arr[right]!=arr[left]){
                left++;
                arr[left] = arr[right];
            }
            right++;
        }


        System.out.println(left+1);

    }
}

