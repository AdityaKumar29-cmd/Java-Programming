import java.util.Scanner;

public class check_vote_eligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Congratulation! You are eligible for casting your vote.");
        } else {
            System.out.println("Sorry, you are not eligible to vote.");
        }
    }
}