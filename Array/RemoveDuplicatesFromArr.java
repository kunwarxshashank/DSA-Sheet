public class RemoveDuplicatesFromArr {
    public static int RemoveDuplicate(int nums[]){
        int n = nums.length;
        if(n==0){
            System.out.println("numsay doesn't have any elements");
            return 0;
        }

        int k = 1;
        for(int i=1; i<n; i++){
            if(nums[i-1]!=nums[i]){ // i=1 => 10-20 k=1 {20}; i=2 => 20-20; ; i=3 => 20-30 k=2 {30}; i=4 => 30-30; i;=5 => 30-30
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int nums[] = {10, 20, 20, 30, 30, 30};
        int k = RemoveDuplicate(nums);    
        
        for(int i=0; i<k; i++){
            System.out.println(nums[i]);
        }
    }
}


    // iterate karo sare array ko i=1 se n tak
    // ab compare karo agar i-1{0} != i{1} hai yani duplicate ni hai use array[k] me store karo
    // initially k 0 rhega
    // arr[k] = arr[i-1]; aur k ko increment krenge :=> k = 0,1,2,3,4 usme array ki value store hogi
    // ab k return krenge