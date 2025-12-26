class MaxInArray {
    public static void main(String[] args) {

        int[] array = ArrayInputFunction.OneDArrayInput();

        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum element in the array is: " + max);
    }
}
