import java.util.HashSet;

public class Hashset{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //creating scan object
        System.out.println("Enter value of n: ");   
        int n = scan.nextInt(); //taking value of n

        System.out.println("Enter Value of Array");
        int arr[] = new int[n]; // Declaring size of aray by input
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt(); // Passing Input to the arr[i];
        }

        
        
    }
}