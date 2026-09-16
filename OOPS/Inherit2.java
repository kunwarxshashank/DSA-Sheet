class Animal{
    Animal(){
        System.out.println("Animal hu main");
    }
}

class Dog extends  Animal{
    Dog(){
        super();
        System.out.println("BHOWWWW");
    }
}

public class Inherit2 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
    }
}
