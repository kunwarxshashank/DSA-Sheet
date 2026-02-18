public class LargestOddNumber {

   /*
    public static String findOdd(String num) {
        
        StringBuilder sb = new StringBuilder();
        char arr[] = num.toCharArray();

        // exclude first even and then add all value including leading 0
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]%2!=0 && sb.length()==0){
                sb.append(arr[i]);
            }
            else if(sb.length()>0){
                sb.append(arr[i]);
            }
        }

        // reverse the string to original position
        sb.reverse();

        // delete all the zeroes at starting 
        while (sb.length()>0 && sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }   
   */ 

    public static String findOdd(String num) {
        int index = -1;
        
        for (int i = 0; i < num.length(); i++) {
            int n = Integer.valueOf(num.charAt(i));
            if(n%2==1){
                index = i; // index = 1; 2;
            }
        }
        
        
        return num.substring(0, index+1);
    }


    public static void main(String[] args) {
        String num = "0354278"; // output: 214683
        String result = findOdd(num);
        System.out.println(result);

        // substring
        String str = "hello bro";
    }
}
