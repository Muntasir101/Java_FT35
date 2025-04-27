package day2_loops_methods;

public class UserDefineMethods {

    public static String FirstName = "Mr.Smith";

    public static void method1(){
        System.out.println("Method 1 from UserDefineMethods Class Execute");
    }

    private void method2(){
        System.out.println("Method 2 from UserDefineMethods Class Execute");
    }

    protected static void method3(){
        System.out.println("Method 3 from UserDefineMethods Class Execute");
    }


    public static void main(String[] args) {
        method1();
    }

}
