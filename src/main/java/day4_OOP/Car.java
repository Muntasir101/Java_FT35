package day4_OOP;

class CarTemplate {
    String color;
    String Model;

    void drive() {
        System.out.println("The car is driving");
    }
    void breaking(){
        System.out.println("The car is breaking");
    }
}

public class Car {
    public static void main(String[] args) {
        CarTemplate Toyota = new CarTemplate();
        Toyota.color = "Red";
        Toyota.drive();


        CarTemplate Honda = new CarTemplate();
        Honda.Model = "Civic";
        Honda.color = "Black";
        Honda.drive();
        Honda.breaking();
    }
}
