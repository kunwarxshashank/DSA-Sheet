class Calculator {
    void calculate(int a, int b) {
        int c = a + b;
        System.out.println("Addition is: " + c);
    }

    void calculate(double a, double b) {
        double c = a + b;
        System.out.println("Addition is: " + c);
    }
}







class Employee {
    void work(){
        System.out.println(" Work done..");
    }
}


class Manager extends Employee{
    void work(){
        System.out.println("Work done by Manager");
    }    
}

class Intern extends Employee{
    void work(){
        System.out.println("Work done by intern");
    }
}


public class Poly2 {
    public static void main(String[] args) {
        // Calculator c1 = new Calculator();
        // c1.calculate(10, 2);
        // c1.calculate(2.0, 3.0);

        Employee e1 = new Employee();
        e1.work();
    }
}
