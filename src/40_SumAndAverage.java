class SumAndAverage {
    public static void main(String[] args) {
        int[] array = ArrayInputFunction.OneDArrayInput();

        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        double avg = (double) sum / array.length;

        System.out.println("The Sum of all elements in the array is: " + sum);
        System.out.println("The Average of all elements in the array is: " + avg);
    }
}
