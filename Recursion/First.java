public class First{
    public static void Recursion(int i, int n){
        System.out.println("Count: "+i+ " Value from param is: "+n);

        // This is base case
        if(i>10){
            return;
        }

        // Function calling itself
        Recursion(i++, n);  
    }

    public static void main(String[] args) {
        int n=10;
        int i =1;
        Recursion(i, n);
    }
}
