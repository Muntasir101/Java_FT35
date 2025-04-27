package day4_OOP;

class StudentTemplate {
    // Step 1: private variables
    private String name;
    private int age;

    // Step 2: public getter
    public String getName() {
        return name;
    }

    // Step 2: public setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class Student {
    public static void main(String[] args) {
        // Corrected: using StudentTemplate
        StudentTemplate student1 = new StudentTemplate();
        student1.setName("Smith");
        student1.setAge(20);

        System.out.println("Student1 Name: " + student1.getName());
        System.out.println("Student1 Age: " + student1.getAge());

        StudentTemplate student2 = new StudentTemplate();
        student2.setName("Green");
        student2.setAge(-10);

        System.out.println("Student2 Name: " + student2.getName());
        System.out.println("Student2 Age: " + student2.getAge());
    }
}
