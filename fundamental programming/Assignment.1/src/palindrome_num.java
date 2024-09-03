import java.util.Scanner;

public class palindrome_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String cleanedString = input.toLowerCase().replaceAll(" ","");
        StringBuilder reversedString = new StringBuilder();

        for (int i = cleanedString.length() - 1; i >= 0; i=i-1) {
            reversedString.append(cleanedString.charAt(i));
        }
        if(cleanedString.equals(reversedString.toString())){
            System.out.println("The string is a palindrome.");
        }
        else{
            System.out.println("The string is a not palindrome.");
        }
    }
}