public class Swapping{
    public static void main(String[] args) {
        int a = 5; // 101
        int b = 3; // 011

        a = a^b; // 101 ^ 011 => 110 (6)
        b = b^a; // 110 ^ 101 => 011 (3) 
        a = a^b; // 110 ^ 011 => 101 (5);

        System.out.println(a+ " "+b);


        /*
            a ^ b ^ b = a
            a ^ b ^ a = b          
        */
    }
}