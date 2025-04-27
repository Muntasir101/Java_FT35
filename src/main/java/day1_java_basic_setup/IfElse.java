package day1_java_basic_setup;

public class IfElse {
    public static void main(String[] args) {
       int pass_marks = 40;
       int student_marks = 80;

        if (student_marks >= pass_marks ){
            System.out.println("Passed the exam");
        }
        else {
            System.out.println("Failed the exam");
        }
    }
}
