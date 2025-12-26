import java.util.Arrays;

class MergeTwoSortedArray {
    public static void main(String[] args) {

        System.out.println("Enter first Sorted Array");
        int[] array1 = ArrayInputFunction.OneDArrayInput();

        System.out.println("Enter Second Sorted Array");
        int[] array2 = ArrayInputFunction.OneDArrayInput();

        int[] merged = new int[array1.length + array2.length];

        int i = 0, j = 0, k = 0;

        while(i < array1.length && j < array2.length) {
            if(array1[i] <= array2[j]) {
                merged[k++] = array1[i++];
            } else {
                merged[k++] = array2[j++];
            }
        }

        while(i < array1.length) {
            merged[k++] = array1[i++];
        }

        while(j < array2.length) {
            merged[k++] = array2[j++];
        }

        System.out.println("Arrays After Merging Becomes: " + Arrays.toString(merged));
    }
}
