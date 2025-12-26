import java.util.Scanner;
class SumOfDiagonalElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows (square matrix): ");
        int rows = sc.nextInt();
        int [][] array = new int[rows][rows];

        // Input elements
        System.out.println("Enter elements of the matrix (" + rows*rows + " elements): " );
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) { // Imp Condition

            // Primary diagonal numbers
            sum += array[i][i];

            // Secondary diagonal (skip center if rows is odd)
            if (i != rows - i - 1) {
                sum += array[i][rows - i - 1];
            }
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}
