public class OddPrint{
    public static void main(String[] args) {
        int arr[] = {12,45,33,28,19};   //output= {12,45,33}

        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int val = arr[i];

            // counting values of each arr number
            int last = val%10; // gives last values 2
            int div = val/10;
            int newval = last+div;

            // giving arr[i]
            if(newval%3==0){
                System.out.println(arr[i]);
            }

        }

    }

}