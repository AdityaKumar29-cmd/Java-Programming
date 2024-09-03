import java.util.Scanner;

public class FibonacciPrinter {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int count = 0;

        System.out.println("The first 10 Fibonacci numbers are:");

        while (count < 10) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            count++;
        }
    }
}