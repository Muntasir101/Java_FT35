package day2_loops_methods;

public class Calculator {
    public static int number1 = 100;
    public static int number2 = 50;

    public static void summation(){
        int result = number1 + number2;
        System.out.println("Summation: "+result);
    }
    public static void subtraction(){
        int result = number1 - number2;
        System.out.println("Subtract: "+result);
    }
    public static void multiplication(){
        int result = number1 * number2;
        System.out.println("Multiplication: "+result);
    }
    public void division(){
        int result = number1 / number2;
        System.out.println("Division: "+result);
    }

    public static void main(String[] args) {
        Calculator.summation();
        Calculator.subtraction();
        Calculator.multiplication();

        Calculator obj = new Calculator();
        obj.division();
    }

}
