import java.util.Scanner;

public class MethodScope {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println("Sum: " + result);
        int product = multiply(result, 3);
        System.out.println("Product: " + product);
    }
}