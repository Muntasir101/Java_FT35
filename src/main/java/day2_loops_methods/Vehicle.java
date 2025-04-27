package day2_loops_methods;

public class Vehicle {

    public static void car(String CarName, int Mileage){
        System.out.println(CarName);
    }

    public static void bus(String BusName, String Model){
        System.out.println(BusName);
    }

    public static void bike(String BikeName, int Year){
        System.out.println(BikeName);
    }

    public static void main(String[] args) {
        car("Toyota", 20000);
        bus("Volvo", "BR9");
        bike("Honda", 2025);
    }

}
