import java.util.Scanner;

public class CastLongToByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a large integer value (long): ");
        long longValue = scanner.nextLong();

        byte byteValue = (byte) longValue;

        System.out.println("The byte value is: " + byteValue);
    }
}