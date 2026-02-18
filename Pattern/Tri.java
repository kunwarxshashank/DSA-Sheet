
/*
public class Tri {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) { // count 1
            for (int j = (n - i - 1); j >= 0; j--) {
                System.out.print(" ");
            }

            for(int k=0; k<(2*i+1); k++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}

*/
public class Tri{
    public static void main(String[] args) {
        int n =5;

        for(int i=0; i<n; i++){

            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            //star
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
 
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}