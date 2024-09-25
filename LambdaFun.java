@FunctionalInterface
interface A {
    int add(int a, int b); // Method signature for the functional interface
}

public class LambdaFun {
    public static void main(String[] args) {
        try {
            A obj = (a, b) -> a + b; // Lambda expression implementing the add method
            int res = obj.add(2, 3); // Calling the add method
            System.out.println(res);  // Output should be 5
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
