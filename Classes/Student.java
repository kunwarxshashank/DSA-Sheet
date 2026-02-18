import java.util.Scanner;


public class Student {
    public static int calculateAverage(int marks[]){
        System.out.println(marks[0]);
        int n = marks.length;
        int total = 0;

        //calculating avg
        for(int i =0; i<n; i++){
            total = total + marks[i];
        }
        int avg = total/5;
        return avg;
    }

    public static String getGrade(int avg){
        String grade = "A";
        if(avg>=90){
            return "A";
        }
        if(avg>=75){
            return "B";
        }
        if(avg>=60){
            return "C";

        }else{
            return "D";
        }

    }


    public static void main(String[] args) {
        
        System.out.println("Enter Name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Name: "+name);

        
        int marks[] = {10,20,30,40,50};

        int avg = calculateAverage(marks);
        String grade = getGrade(avg);

        System.out.println("Name: "+name);
        System.out.println("Avg: "+avg);
        System.out.println("Grade: "+grade);



    }
}
