package day2_loops_methods;

public class ReturnTypeDemo {
    static int summation(int number1,int number2){
        return number1 + number2;
    }
    String subtraction(String Name){
        return Name;
    }

    public static void main(String[] args) {
        int result = summation(10,20);
        System.out.println(result);

        ReturnTypeDemo obj = new ReturnTypeDemo();
        System.out.println(obj.subtraction("Hello"));
    }
}
