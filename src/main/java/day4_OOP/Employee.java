package day4_OOP;

// Parent class (Super Class)
class EmployeeTemplate {
    String EmployeeName;
    String EmployeeDepartment;

    void work() {
        System.out.println("The employee is working");
    }
}

// Child class (Sub Class)
class ToyotaEmployee extends EmployeeTemplate {
    void assembleParts() {
        System.out.println("Parts Assemble in Toyota");
    }
}

// Another Child class (Sub Class)
class HondaEmployee extends EmployeeTemplate {
    void saleHonda() {
        System.out.println("Honda Selling");
    }
}

public class Employee {
    public static void main(String[] args) {
        ToyotaEmployee toyotaCar = new ToyotaEmployee();
        toyotaCar.EmployeeName = "Mr. Smith";
        toyotaCar.EmployeeDepartment = "Automobiles";
        toyotaCar.work();
        toyotaCar.assembleParts();

        System.out.println("-------------------");

        HondaEmployee hondaCar = new HondaEmployee();
        hondaCar.EmployeeDepartment ="Marketing";
        hondaCar.work();
        hondaCar.saleHonda();
    }
}
