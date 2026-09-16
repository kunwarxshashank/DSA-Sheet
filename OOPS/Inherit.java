class Animal {
    void sound() {
        System.out.println("Animal roar");
    }
}

class Dog extends Animal {
    @Override 
    void sound() {
        System.out.println("dog.....");
    }

    void hearSound(){
        sound();
        super.sound();
    }
}

public class Inherit {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
