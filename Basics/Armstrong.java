public class Armstrong {
    public static void main(String[] args) {
        int x = 200;
        int n = x;
        int y = x;
        int length = 0;
        int total = 0;

        while (n > 0) {
            // Find length
            n = n / 10;
            length++; // 3
        }
        System.out.println("Length is: " + length);

        while (y > 0) {
            int last = y % 10; // 1 // 7 //3
            int val = 1;
            for (int i = 1; i <= length; i++) {
                val *= last;
            }
            System.out.println("Power of " + last + "is: " + val);
            y = y / 10; // 37 //3
            total += val;
        }

        System.out.println(total);

    }
}
