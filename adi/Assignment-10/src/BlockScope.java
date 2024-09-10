import java.util.Scanner;

public class BlockScope {
    public static void calculate() {
        int x = 10;
        System.out.println("Value of x outside the loop: " + x);
        for (int i = 0; i < 3; i++) {

            System.out.println("Value of x inside the loop (iteration " + i + "): " + x);
        }
        System.out.println("Value of x outside the loop after the loop: " + x);
    }

    public static void main(String[] args) {

        calculate();
    }
}