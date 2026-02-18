/*
public class GCD {
    public static int checkGCD(int n1, int n2){
        int count1 = 0;
        int count2 = 0;
        int index1 =0;
        int index2 = 0;
        int max = 1;

        // finding n1 count 
        for(int i=1; i<=n1; i++){
            if(n1%i==0){
                count1++;
            }
        }

        // finding n2 count 
        for(int i=1; i<=n2; i++){
            if(n2%i==0){
                count2++;
            }
        }

        //creating array of appropriate length
        int arr1[] = new int[count1];
        int arr2[] = new int[count2];


        // Putting values in array
        for(int i=1; i<=n1; i++){
            if(n1%i==0){
                arr1[index1++] = i;
            }
        }
        
        for(int i=1; i<=n2; i++){
            if(n2%i==0){
                arr2[index2++] = i;
            }
        }

        // Check greator divisble
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));

        for(int i=1; i<arr1.length; i++){
            for(int j=1; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                        max = arr1[i];
                }
            }
        }
        // System.out.println("Max is "+max);

        return max;
    }

    public static void main(String[] args) {
        int max = checkGCD(10,20);
        
        System.out.println("Max Common divisble is: "+max);
    }
}
*/

/*
public class GCD{
    public static int checkGCD(int n1, int n2){
        // assuming gcd is 1
        int gcd = 1;
        int limit;

        // loop should go till smaller number
        if(n1>n2){
            limit = n2;
        }else{
            limit = n1;
        }

        // checking if n1 & n2 divisble by same number if divisble then store that number it will
        // be gcd, as loop is on increasing order to so last value till limit will be gcd
        for(int i=1; i<=limit; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int result = checkGCD(10, 20);
        System.out.println(result);
    }
}


*/


public class GCD {
    public static int checkGCD(int a, int b){
        if(b==0)return a;
        System.out.println("a is: "+a+ " b is: "+b);
        return checkGCD(b, a%b);
        
    }
    public static void main(String[] args) {
        int result = checkGCD(10, 15);
        System.out.println(result);
    }
}