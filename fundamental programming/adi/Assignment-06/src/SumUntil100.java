import java.util.Scanner;

public class SumUntil100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (sum < 100) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
            sum += num;

            if (sum >= 100) {
                break;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}