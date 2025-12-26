import java.util.Arrays;

class ReverseTheArray {
    public static void main(String[] args) {

        int [] array = ArrayInputFunction.OneDArrayInput();

        System.out.println("Original Array: " + Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-i-1] = temp;
        }

        System.out.println("Array after reversing: " + Arrays.toString(array));

    }
}
