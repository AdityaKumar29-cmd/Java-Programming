import java.util.Scanner;

public class MatrixRowColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize a 3x3 matrix
        int[][] matrix = new int[3][3];

        // Input elements for the matrix
        System.out.println("Enter elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate and print the sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        sc.close();
    }
}