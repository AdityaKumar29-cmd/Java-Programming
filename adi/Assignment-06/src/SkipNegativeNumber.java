import java.util.Scanner;

public class SkipNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            if (num < 0) {
                continue;
            }

            sum += num;
        }

        System.out.println("The sum of positive numbers is: " + sum);
    }
}