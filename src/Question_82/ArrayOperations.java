package Question_82;
import java.util.Arrays;

public class ArrayOperations {

    public static class Statistics {

        public static double mean(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            double sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum / arr.length;
        }

        public static double median(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array cannot be null or empty");
            }
            int[] copy = arr.clone();
            Arrays.sort(copy);
            int n = copy.length;

            if (n % 2 == 0) {
                return (copy[n / 2 - 1] + copy[n / 2]) / 2.0;
            } else {
                return copy[n / 2];
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 7};

        System.out.println("Mean: " + ArrayOperations.Statistics.mean(numbers));
        System.out.println("Median: " +  ArrayOperations.Statistics.median(numbers));
    }
}
