public class Print {
    public static void print(int n) {
        
        if(n==10){
            return;
        }
        System.out.println(n);
        print(n+1);

    }

    public static int Factorial(int n) {
        
        if(n==0){
            return 1;
        }
        int ans = n*Factorial(n-1);
        return ans;

    }


    public static int Fibonacci(int n) {
        
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        int ans = Fibonacci(n-1)+Fibonacci(n-2);
        return ans;

    }

    public static int NNaturalNum(int n) {
        
        if(n==0){
            return 0;
        }
        
        int answer = n+NNaturalNum(n-1);
        return answer;
    }


    public static void main(String[] args) {
        // print(1);
        // System.out.println(Factorial(0));
        // System.out.println(Fibonacci(5));
        System.out.println(NNaturalNum(5));
    }
}
