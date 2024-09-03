import java.util.Scanner;

public class CreateSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first part of the sentence:");
        String part1 = scanner.nextLine();

        System.out.print("Enter the second part of the sentence:");
        String part2 = scanner.nextLine();

        System.out.print("Enter the third part of the sentence:");
        String part3 = scanner.nextLine();

        String sentence = part1 + " " + part2 + " " + part3 + ".";

        System.out.println("Complete sentence:"+ sentence);
        System.out.println("Complete sentence:"+ sentence);
    }
}