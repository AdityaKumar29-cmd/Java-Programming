import java.util.Scanner;

public class QuadrantFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        int x = scanner.nextInt();

        System.out.print("Enter Y coordinate: ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("The point is in the First Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the Second Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the Third Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the Fourth Quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point lies on the Y-axis.");
        } else if (y == 0 && x != 0) {
            System.out.println("The point lies on the X-axis.");
        } else {
            System.out.println("The point is at the Origin.");
        }

        scanner.close();
    }
}