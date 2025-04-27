package day2_loops_methods;

public class MethodOverloadDemo {
    static int summation(int number1,int number2){
        return number1 + number2;
    }
    static int summation(int number1,int number2,int number3){
        return number1 + number2 + number3;
    }
    static double summation(double number1,double number2){
        return number1 + number2;
    }

    public static void main(String[] args) {
        System.out.println(summation(10,20));
        System.out.println(summation(10,20,30));
        System.out.println(summation(1.5,1.5));
    }
}
