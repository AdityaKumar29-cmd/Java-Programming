import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int sum = 0;
        int i = 2; // Start from the first even number

        while (i <= limit) {
            sum += i * i * i;
            i += 2;
        }

        System.out.println("The sum of cubes of even numbers up to " + limit + " is: " + sum);
    }
}