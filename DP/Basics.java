public class Basics {
    public int recusrion(int n) {
        return 0;
    }

    static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-2)+fib(n-1);
    }

    public static void main(String[] args) {
        // fibonnaci f(0) = 0;
        // f(1) = 1;
        // f(2) = f(n-1)+f(n-2); => f(1)+f(2);

        // recusrion
        int n = 5;
        System.out.println(fib(n));

    }
}