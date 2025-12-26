import java.util.Scanner;

class SumAverage2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] array = ArrayInputFunction.TwoDArrayInput();

        int rows = array.length;
        int cols = array[0].length;

        int sum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }

        // Calculate average
        double avg = (double) sum / (rows * cols);

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + avg);
    }
}
