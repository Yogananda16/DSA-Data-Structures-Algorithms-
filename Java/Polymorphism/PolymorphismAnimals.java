package Java.Polymorphism;

class Animal {

    // parent method
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// child 1 class
class Dog extends Animal {

    // child 1, overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// child 2 class
class Cat extends Animal {

    // child 2 overriding parent class
    @Override
    void sound() {
        System.out.println("Cat makes Meow");
    }
}

public class PolymorphismAnimals {

    public static void main(String[] args) {
        // Parent referencing to child 1 object
        Animal a1 = new Dog();
        a1.sound();

        // Parent referencing to child 2 object
        Animal a2 = new Cat();
        a2.sound();
    }
}
