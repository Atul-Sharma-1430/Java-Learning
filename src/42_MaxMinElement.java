class MaxMinElement {
    public static void main(String[] args) {

        int[] array = ArrayInputFunction.OneDArrayInput();

        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum element in the array: " + max);
        System.out.println("Minimum element in the array: " + min);
    }
}
