import java.util.Scanner;

public class value_based_on {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        int n;

        if (m > 0) {
            n = 1;
        } else if (m == 0) {
            n = 0;
        } else {
            n = -1;
        }

        System.out.println("The value of n = " + n);
    }
}
