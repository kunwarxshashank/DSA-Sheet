
// Super Keyword
// ✅ 1. Access Parent Class Variable
// ✅ 2. Access Parent Class Method
// ✅ 3. Call Parent Class Constructor


class ParentClass {
    int x = 100;

    void display() {
        System.out.println("this is display from parent class using super keyword");
    }

    // Parent class constructor
    ParentClass() {
        System.out.println("this is parent class constructor");
    }
}



class ChildClass extends ParentClass {
    int x = 200;

    // yaha pe agar x print karenge to childclass ka print hoga
    // to agar parent ka variable x print krana ho to hum "super" keyword use krenge
    // ✔ super.x accesses the parent’s variable.

    void display() {
        System.out.println("this is display from child class");
    }

    void show() {
        System.out.println(x); // output: x = 100;
        System.out.println(super.x); // output: x = 200;

        display(); // call child class display
        super.display(); // call parent function
    }

    // child class constructor
    ChildClass(){
        // NOTE:  ✅ super() must be the FIRST statement in a constructor.
        // Java does not allow anything before it — not even a println
        super();
        show();
    }


    



}

public class SuperKeyword {

    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        c1.show();
    }
}
