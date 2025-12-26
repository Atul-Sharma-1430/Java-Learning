class SortedArrayChecking {
    public static void main(String[] args) {

        int[] array = ArrayInputFunction.OneDArrayInput();

        boolean isAscendingSorted = true;
        boolean isDescendingSorted = true;
        int num1 = 0, num2 = 0, index = -1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscendingSorted = false;
                num1 = array[i];
                num2 = array[i + 1];
                index = i;
                break;
            }

            if (array[i] < array[i + 1]) {
                isDescendingSorted = false;
                num1 = array[i];
                num2 = array[i + 1];
                index = i;
                break;
            }
        }

        if (isAscendingSorted) {
            System.out.println("The array is sorted in Ascending order.");
        } else if (isDescendingSorted) {
            System.out.println("The array is sorted in Descending order.");
        } else {
            if (num1 > num2) {
                System.out.println("The array is not sorted because " + num1 + " at index " + index +
                        " is greater than " + num2 + " at index " + (index + 1));
            } else {
                System.out.println("The array is not sorted because " + num1 + " at index " + index +
                        " is less than " + num2 + " at index " + (index + 1));
            }
        }
    }
}
