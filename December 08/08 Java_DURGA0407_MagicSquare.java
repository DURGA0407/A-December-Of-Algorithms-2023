import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimension of the matrix (odd number): ");
        int n = scanner.nextInt();

        if (n % 2 == 0 || n < 3 || n > 15) {
            System.out.println("Invalid input! Please enter an odd integer between 3 and 15.");
            return;
        }

        int[][] magicSquare = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;

        while (num <= n * n) {
            magicSquare[row][col] = num++;
            int nextRow = (row - 1 + n) % n;
            int nextCol = (col + 1) % n;

            if (magicSquare[nextRow][nextCol] != 0) {
                row = (row + 1) % n;
            } else {
                row = nextRow;
                col = nextCol;
            }
        }

        System.out.println("Magic Square for " + n + ":\n");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
