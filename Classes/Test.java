/*
 Q.Wap to cheeck if array of integer follows a wave patteern

 Wave pattern is a[0] < a[1] > a[2] < a[3] > a[4]

 e.g INPUT=   [2,9,1,8,3,7]
    [3,5,2,2,1] not wave


Q.2 String comparrison without inbuild methods
Wap that takes string and compress it using count of repeated characters
example: "aaabbcddddd" output: a3b2c1d5

Using basic string and loops
Handles upper/lower case seprately



Q3. Students grading system 
Create a student class with
> private filed name, marks[] for 5 subjects
> methods
    calculateAverage();
    getGrade()=>
        A if avg>=90
        B if avg>=75
        C if avg>= 60
        D otherwise

    in main() create array of student, input details and print name with grade


Q4. Wap to take a sentence and revers only the words that appear once in the sentence
example: "hellow world hello java code world"

use string splitting counting with oops and conditions no array


Q.5 create a base class Employee with name, baseSalary(), and method calculateSalary()
    Derive 
    FullTimeEmployee: bonus = 20% of base
    PartTimeEmployee: hourlyPay * hoursWorked

    In main():
        > Store both types in array of Employee
        > Use polymorphism to print their total salary

Q
PRINT ONLY THE NUNBER WHOSE SUM OF DIGIT IS ODD

[12,45,33,28,19]
[45,33,19]

    */

public class Test {
    public static void main(String[] args) {
        String str = "aaabbcddddd";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean duplicate = false;

            int count = 1;

            for (int j = 0; j < str.length(); j++) {
                char chx = str.charAt(j);
                if (ch == chx) {
                    duplicate = true;
                    count = count + 1;
                     // System.out.println("count is: "+count);
                }
            }
  
            if (!duplicate) {
              System.out.print(ch + "" + count);
            }
        }
    }
}


