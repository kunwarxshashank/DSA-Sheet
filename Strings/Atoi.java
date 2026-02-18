public class Atoi {
    public static int stringAtoi(String s) {

        // 1. remove whitespace
        s = s.trim();

        // 2. remove leading zero (keep sign)
        s = s.replaceFirst("^([+-]?)0+(\\d)", "$1$2");

        // 3. 
        
        // 4. keep only digits and optional sign
        s = s.replaceAll("[^0-9+-]", "");

        // 5. convert to integer
        int num = Integer.parseInt(s);

        return num;
    }

    public static void main(String[] args) {
        String s = "0-1"; // -00012345avhg // 0-1
        int result = stringAtoi(s);
        System.out.println(result);
    }
}
