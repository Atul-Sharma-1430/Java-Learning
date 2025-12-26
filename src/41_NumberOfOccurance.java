import java.util.Scanner;

class NumberOfOccurrence {
    public static void main(String[] args) {

        int[] array = ArrayInputFunction.OneDArrayInput();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check its occurrences: ");
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }

        System.out.println(target + " occurs " + count + " times in the array.");

        sc.close();
    }
}
