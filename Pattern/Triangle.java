/*
 

public class Triangle {
    public static void main(String[] args){
        int n = 5;
        for(int i=1; i<=2*n-1; i++){
            int stars = i;

            if (stars>n) stars = 2*n-i;

            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

*
**
***
****
*****
****
***
**
*


*/


/* 
public class Triangle {
    public static void main(String[] args) {
        int n =5;
        for(int i = 1; i<=n; i++){

            int start;
            if(i%2==0){
                start = 0;
            }else{
                start = 1;
            }
                
            for(int j=1; j<=i; j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println("");
        }
    }
}

1
01
101
0101
10101

*/


/*
public class Triangle {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count++);
            }
            System.out.println("");
        }
    }
}

1
23
456
78910
1112131415

*/


public class Triangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n; i++){

            //first side
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            //gap
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //reverse side
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            
            System.out.println("");
        }
    }
}