import java.util.Scanner;

public class HourGlassSum {
    static int findMaxSum(int[][] mat, int R, int C) {
        int max_sum = 0;
        int sum;

        if (R < 3 || C < 3) {
            System.out.println("Not possible");
            System.exit(0);
        }

        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                sum = (mat[i][j] * mat[i][j + 1] + mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] * mat[i + 2][j + 1] + mat[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxHourglassSum = findMaxSum(matrix, rows, cols);
        System.out.println("Maximum hourglass sum: " + maxHourglassSum);
    }
}
