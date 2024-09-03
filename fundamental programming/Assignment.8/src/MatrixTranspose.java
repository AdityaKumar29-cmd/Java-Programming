import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize a 3x3 matrix
        int[][] matrix = new int[3][3];
        int[][] transposeMatrix = new int[3][3];

        // Input elements for the matrix
        System.out.println("Enter elements for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Compute the transpose of the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        // Print the transpose matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}