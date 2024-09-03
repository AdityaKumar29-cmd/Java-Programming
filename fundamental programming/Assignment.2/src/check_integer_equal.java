import java.util.Scanner;

public class check_integer_equal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Number1 and Number2 are equal");
        } else {
            System.out.println("Number1 and Number2 are not equal");
        }
    }
}