

public class Prime {
/*
 
   public static Boolean CheckPrime(){
       int n = 7;
        int[]arr = new int[2];
        int index = 0;

        for(int i=1; i<=n; i++){
            if(index>1){
                return false;
            }
            if(n%i==0){
                arr[index++] = i;
            }
        }

        if(arr[0] == 1 && arr[1] == n){
            return true;
        }
        return false;
    }   
 */
    public static Boolean CheckPrime(int n){
        
        int index = 0;

        // For 0,1 and -ve return false;
        if(n<=1){
            return false;
        }

        // Check divisor
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(index>1){
                    return false;
                }
                index ++;
            }
        }
        return true;
    }
 
    public static void main(String[] args) {
        Boolean result = CheckPrime(17);
        System.out.println(result);
    }
}
