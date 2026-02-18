/*

Polymorphism: Many + Form;
When a single entity (Methods, Objects, Class) can perform different task

Types:
1. Compile time (Achived By Method Overloading)
2. Runtime Polymorphism (Achived By Method Overriding)

*/ 



//______Compile Time Polymorphism__________


class Music{

    // Here same methods with different parameters
    void Player(String name){
        System.out.println(name);
    }

    void Player(String name, int songs){
        System.out.println(name+songs);
    }

}



class Employee{

    void getDetails(String name){
        System.out.println("Employee: "+name);
    }
    void getDetails(String name, int age, double sallary){
        System.out.println("Name: "+name+ " Age: "+age+ " Sallary: "+sallary);
    }
}


//_____________RUN TIME POLYMORPHISM_____________

class Camera{
    String photos;
    int num;

    void Capture(String photos){
        System.out.println("Capturing photos");
    }
}

class Capture2 extends Camera{
    @Override // This states that method is overriding
    void Capture(String photos){
        System.out.println("Capturing photos: "+photos);
    }
}




public class Polymorphism {
    public static void main(String[] args) {
        // Music m1 = new Music();
        // String name = "Jai ho";
        // int songs = 1;
        // m1.Player(name);
        // m1.Player(name, songs);

        // String name = "Aman";
        // int age = 20;
        // double sallary = 4000.00;
        // Employee e1 = new Employee();
        // e1.getDetails(name);
        // e1.getDetails(name, age, sallary);

        // Camera c = new Camera();
        // c.Capture("pho");

        Camera c = new Capture2(); // Yaha pe Camera class se Capture 2 ka object bana rhe to capture2 call hoga
        c.Capture("pho");
    }
}