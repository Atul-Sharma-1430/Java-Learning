import java.util.Scanner;

class OccurrenceCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = ArrayInputFunction.OneDArrayInput();
        System.out.print("Enter the target: ");
        int find = sc.nextInt();

        int count = 0;

        for (int num : numbers) {
            if (num == find) {
                count++;
            }
        }

        System.out.println(find + " occurs " + count + " times in the array.");

        sc.close();
    }
}
