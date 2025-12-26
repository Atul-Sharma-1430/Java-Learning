import java.util.Arrays;
import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] array = ArrayInputFunction.OneDArrayInput();

        System.out.print("Enter the number which is to be deleted: ");
        int num = sc.nextInt();

        int newSize = array.length;
        for (int k : array) {
            if (k == num) {
                newSize--;
            }
        }

        int [] newArray = new int[newSize];
        int j = 0;
        for (int k : array) {
            if (k != num) {
                newArray[j] = k;
                j++;
            }
        }

        System.out.println("Original Array :" + Arrays.toString(array));
        System.out.println("Array after removing " + num + " is " + Arrays.toString(newArray));

        sc.close();
    }
}
