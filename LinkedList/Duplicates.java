public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4};

        int slow = 0;
        int fast = 0;

        while (true) {
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];

            // detect cycle
            if(slow==fast){
                // find starting point
                slow = 0;

                while (slow!=fast) {
                    slow = arr[slow];
                    fast = arr[fast];    
                }
            }

                System.out.println(slow);
        }

    }
}
