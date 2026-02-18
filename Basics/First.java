/*

 * 
 * PRINT ALL THE SEPRATE VALUES LIKE 9 8 7 6 OF 9876
 *
 * 
 
public class First {
    public static void main(String[] args) {
        int num = 9876;
        while (num > 0) {
            int lastdigit = num % 10;
            System.out.println("Last digit is: " + lastdigit);
            num = num / 10;
            System.out.println("New num is: " + num);
        }
    }
}

 */

// public class First {
//     public static void main(String[] args) {
//         int num = 10400;
//         while (num > 0) {
//             int lastdigit = num % 10; //0
//             num = num/10;   // 1040
//             System.out.println(num);
//             //System.out.print(lastdigit);
//         }
//     }
// }

public class First {
    public static void main(String[] args) {
        int result = reverse(1234567);
        System.out.println(result);
    }

    static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int lastdigit = x % 10; // 3 // 2
            rev = (rev * 10) + lastdigit; // 3 //32
            x = x / 10; // 12 //1
        }

        // if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
        //     return 0;
        // }

        return rev;
        
    }

}
