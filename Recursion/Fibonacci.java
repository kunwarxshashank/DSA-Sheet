public class Fibonacci {
    public static int Fib(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci is not defined for negative numbers.");
        }

        int result = Fib(n-1)+Fib(n-2);
        return result;
    }

    public static void main(String[] args) {
        int n = -4;
        int val = Fib(n);
        System.out.println(val);
    }
}
