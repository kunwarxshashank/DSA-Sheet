/*
// For sorted arrays only

public class MissingNumberinArr {
    public static int findValue(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-arr[i-1]!=1){
                return arr[i]-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-3,-2,-1,0,1,2,3,4,5};
        int result = findValue(arr);
        if (result != -1)
            System.out.println("Missing number: " + result);
        else
            System.out.println("No missing number found");
    }
}


*/

public class MissingNumberinArr {
    public static int findValue(int arr[]) {
        int n = 15;
        int sum = (n*(n+1))/2;
        
        int actualVal = 0;
        for (int i = 0; i < arr.length; i++) {
            actualVal=+arr[i];
        }

        return sum-actualVal;

        



    }

    public static void main(String[] args) {
        int arr[] = {11,12,13,15};
        int result = findValue(arr);
        if (result != -1)
            System.out.println("Missing number: " + result);
        else
            System.out.println("No missing number found");
    }
}