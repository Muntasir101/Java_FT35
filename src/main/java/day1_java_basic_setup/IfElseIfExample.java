package day1_java_basic_setup;

public class IfElseIfExample {
    public static void main(String[] args) {
        int marks = 95;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        }
        else if (marks >= 80) {
            System.out.println("Grade: A");
        }
        else if (marks >= 70) {
            System.out.println("Grade: B");
        }
        else {
            System.out.println("Grade: C");
        }
    }
}
