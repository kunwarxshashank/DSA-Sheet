// Inheritance is a one of pillar of oops, 

/* MULTIPLE INHERITANCE NOT SUPPORTED IN JAVA */

//1. SINGLE INHERITANCE

/*
class Fruits{
    String apple = "Apple";
    String banana;
    int appleprice;
}

// Here accessing property from fruits to human class 
class Human extends Fruits{
    void Eat(){
            System.out.println("Fruit: "+apple);
    }
}


public class Inheritance{
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.Eat();
    }
}
*/


class Arrays {
    int[] arr = { 2, 10, 4, 15, 9 };
    int i = 0;
    int last = arr.length-1;
}


class Sorted extends Arrays {

    void SortArray() {
        int last = arr.length - 1; // 4
        for (int i = 0; i < arr.length; i++) {
            int p = arr[i]; // p = 2
            arr[last] = p; // arr[4] = 2
            arr[i] = arr[last]; // arr[0] = 2
            last--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void Descending() {
        int last = arr.length - 1;

        for (int i = 0; i > arr.length; i++) {
            int p = arr[i];
            arr[i] = arr[last];
            arr[last] = p;
            last--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}

// MULTILEVEL INHERITENCE
class A {
    String a = "Class A";
}

class B extends A {
    String b = "Class B";
}

class C extends B {
    String c = "Class C";
}



// MULTIPLE INHERITENCE NOT SUPPORTED
/*
 * class D extends A,B {
 * 
 * }
 */


 
// HIERARICHAL INHERITANCE
class E extends A {
    public void Efunction() {
        System.out.println(" E extends: " + a);
    }
}

class F extends B {
    public void Ffunction() {
        System.out.println(" F extends: " + b);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Sorted s1 = new Sorted();
        s1.SortArray();

        // C c1 = new C();
        // System.out.println(c1.a+c1.b+c1.c); // Multi Level Inheritance

        // E e1 = new E();
        // F f1 = new F();
        // System.out.println(e1.a+f1.a);

    }
}



