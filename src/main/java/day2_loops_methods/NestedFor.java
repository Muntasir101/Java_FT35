package day2_loops_methods;

public class NestedFor {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer i: " + i); // Executes 2 times

            // Inner loop 1
            for (int j = 1; j <= 2; j++) {
                System.out.println(" Inner: j " + j); // Executes 4 times (2 * 2)
            }
        }
    }
}
