class Animal {
    void voice() {
        System.out.println("Animal is calling..."); // Added double quotes
    }
}

class Dog extends Animal {
    @Override 
    void voice() {
        System.out.println("Dog is barking..."); // Added double quotes
    }
}

class NewInherit {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.voice();
    }
}
