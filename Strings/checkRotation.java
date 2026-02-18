import javax.print.DocFlavor.STRING;

public class checkRotation {
    // public static boolean rotation(String s, String goal) {

    //     if(s.length() != goal.length() || (s.length()<2 || goal.length()<2)) return false;

    //     StringBuilder sb = new StringBuilder();
    //     int count = 0;

    //     for (int i = 0; i < s.length(); i++) {

    //         if(s.charAt(count)==goal.charAt(i)){ 
    //             sb.append(s.charAt(count));
    //             count ++;   
    //         }else{
    //             count ++;
    //         }
    //     }
    //     System.out.println(sb.toString()); // l
    //     System.out.println(goal.split(sb.toString())[0]);


    //     if(goal.startsWith(s.split(sb.toString())[0])){
    //         return true;
    //     }

        

    //     return false;
    // }

    public static boolean rotation(String s, String goal) {

        if(s.length() != goal.length() || (s.length()<2 || goal.length()<2)) return false;

        // rotation check
        String rotation = s+s;
        return rotation.contains(goal);
    }

    

    public static void main(String[] args) {
        String s = "defdefdefabcabc"; // 8
        String goal = "defdefabcabcdef";
        boolean result = rotation(s, goal);
        System.out.println(result);
    }
}

// r  o  t  a  t  i  o  n  // 4567 => 1234, 
// t  i  o  n  r  o  t  a  // 