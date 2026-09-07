// public class Car {
//     int speed; // state and instance variable
//     int color; // state and instance variable

//     // creating constructor

//     void Car(){
//         System.out.println("it executes automatically once new object created");
//     }

//     // its a behaviour of class 
//     void running(){
//         System.out.println("broooooooommmmmmmm.....");
//     }



//     public static void main(String[] args) {
//         // Referencetype referencevariable = Object Creation ();
//         Car c1 = new Car();

//         // calling function
//         // c1.running();
//     }

// }

public class Car{
    int speed; // state
    String color;

    void accelerate(){
        speed += 10; // behaviour
    }

    void brake(){
        speed -=10; // behaviour
    }


    public static void main(String[] args) {
        Car c = null;
        c.color = null;

        c.color = "red";
        System.out.println(c.color);
    }
}
