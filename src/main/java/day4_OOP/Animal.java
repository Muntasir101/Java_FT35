package day4_OOP;

// Parent class
class AnimalTemplate {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends AnimalTemplate {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends AnimalTemplate {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Subclass 3
class Cow extends AnimalTemplate {
    @Override
    void makeSound() {
        System.out.println("Cow moos");
    }
}

public class Animal {
    public static void main(String[] args) {
        // Polymorphism: parent reference, child objects
        AnimalTemplate a1 = new Dog();
        AnimalTemplate a2 = new Cat();
        AnimalTemplate a3 = new Cow();

        a1.makeSound();  // Dog's method runs
        a2.makeSound();  // Cat's method runs
        a3.makeSound();  // Cow's method runs
    }
}
