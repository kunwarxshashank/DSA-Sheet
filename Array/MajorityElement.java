import java.util.HashMap;

public class MajorityElement {


    /* 0(n^2) time complexity

    public static int findMajor(int arr[]) {
        int n = arr.length;

        if(arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i; j < arr.length; j++) {
                if (i!=j && arr[i] == arr[j]) {
                    count++;
                    if (count > n / 2) {
                        return arr[i];
                    }
                }

            }
        }
        return -1;
    }

 
    public static int findMajor(int arr[]) {
        
        HashMap <Integer, Integer> map = new HashMap<>();
        
        // num = 7
        // map.getOrDefault(num, 0) ye function check karta hai element agar exist kr raha hai to
        // uska count return karo ya default = 0,

        // uske age +1 => map.getOrDefault(num, 0)+1 yah batata hai ki => 0+1 jo value aai hai usme 1 add krdo tanki
        // single values ka count bana rahe

        // now map.put(num, 1) => store it with count

        // for loop2: agar 7 fir se aya to yaha default nahi uski count return hogi jo ki 1 thi aur wo v increment hoke store hogi
        
        

        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>arr.length/2){
                return num;
            }
        }

        return -1;
    }    

 */   


    public static int findMajor(int arr[]) {
        int count = 0;
        int element = 0;
        for (int i = 0; i < arr.length; i++) {

            if(count == 0){
                element = arr[i]; // 7
            }

            if(arr[i]==element){
                count ++;
            }else{
                count --; // -1, -2, -3, -2, -1, 0, 1
            }

        }
        return -1;
    }    


    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 7, 7 };
        int result = findMajor(arr);
        System.out.println(result);

    }
}
