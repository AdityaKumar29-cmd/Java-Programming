import java.util.Scanner;

public class PrintExceptVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        for (int i =0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (isVowel(c)) {
                continue;
            }
            System.out.print(c);
        }
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}